/*
 * To change this license header, choose License Headers in Project Properties.
 */
package model.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectDb {
    
    private static EntityManagerFactory  emf = Persistence.createEntityManagerFactory("myPU");
    
    public EntityManager getConnection(){        
        return emf.createEntityManager();
    }
    
}
