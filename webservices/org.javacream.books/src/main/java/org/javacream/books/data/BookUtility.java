package org.javacream.books.data;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Component
public class BookUtility {
    @PersistenceContext private EntityManager entityManager;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void log(String message){
        Query query = entityManager.createNativeQuery("insert into messages values(:m)");
        query.setParameter("m", message);
        query.executeUpdate();
    }
}
