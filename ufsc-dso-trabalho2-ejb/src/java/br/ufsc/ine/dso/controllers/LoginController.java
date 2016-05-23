/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine.dso.controllers;

import br.ufsc.ine.dso.models.Cliente;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author mmiola
 */
@Stateless
public class LoginController {
    
    @PersistenceContext
    EntityManager em;
    
    public Boolean logar(Cliente cliente){
        return em.createNamedQuery(Cl);
    }
            
    
}
