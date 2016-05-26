/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine.dso.controllers;

import br.ufsc.ine.dso.models.Cliente;
import java.util.Optional;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Valdir Luiz
 */
@Stateless
public class ClienteController {

    @PersistenceContext
    EntityManager em;

    public Optional<Cliente> buscarCliente(String login, String senha) {
        Optional<Cliente> cliente = null;
        Query query = em.createNamedQuery("Cliente.findByLoginAndSenha");
        query.setParameter("login", login);
        query.setParameter("senha", senha);
        try {
            cliente = Optional.of((Cliente) query.getSingleResult());
        } catch (NoResultException e) {
            cliente = Optional.ofNullable(null);
        }
        return cliente;
    }

}
