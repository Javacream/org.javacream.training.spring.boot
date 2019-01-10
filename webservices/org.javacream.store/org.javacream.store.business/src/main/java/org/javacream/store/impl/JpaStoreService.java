package org.javacream.store.impl;

import org.javacream.store.api.StoreService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Service
public class JpaStoreService implements StoreService {

    @PersistenceContext private EntityManager entityManager;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int getStock(String category, String id) {
        System.out.println(entityManager.createNativeQuery("select * from store").getResultList());
        Query query = entityManager.createNativeQuery("select stock from store where category= :category and item = :item");
        query.setParameter("category", category);
        query.setParameter("item", id);
        try {
            return (int) query.getSingleResult();
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void setStock(String category, String id, int stock) {
        Query query = entityManager.createNativeQuery("insert into store (category,item,stock) values(:category, :item, :stock)");
        query.setParameter("category", category);
        query.setParameter("item", id);
        query.setParameter("stock", stock);
        query.executeUpdate();
    }
}
