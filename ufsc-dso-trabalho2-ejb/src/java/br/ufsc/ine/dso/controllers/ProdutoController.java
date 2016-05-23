/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine.dso.controllers;

import br.ufsc.ine.dso.models.Produto;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Valdir Luiz
 */
@Singleton
public class ProdutoController{
    
    @PersistenceContext
    private EntityManager em;
    
    public void save(Produto produto){
        this.em.persist(produto);
    }
    
    public void update(Produto produto){
        this.em.merge(produto);
    }
 
    
}
