package org.javacream.jpa.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Component
public class JpaDemo {

    @PersistenceContext
    private EntityManager entityManager;

    @PostConstruct
    public void init(){
        System.out.println("***** " + entityManager);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void logMessage(String message){
        Query query = entityManager.createNativeQuery("insert into MESSAGES values('hello')");
        //query.setParameter("message", message);
        query.executeUpdate();
    }
    @Transactional(propagation = Propagation.REQUIRED)
    public void showMessages(){
        Query query = entityManager.createNativeQuery("select * from MESSAGES");
        //query.setParameter("message", message);
        List messages = query.getResultList();
        messages.forEach(System.out::println);

    }
}
