
package br.ufsc.ine.dso.controllers;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Valdir Luiz
 */
public class AbstractController<T> {
    
    @PersistenceContext  
    protected  EntityManager em;  
    
    public void save(T object){
        this.em.persist(object);
    }
    
     public void update(T object){
        this.em.merge(object);
    }
     
     public void remove(T object){
        this.em.remove(object);
    } 
    
}
