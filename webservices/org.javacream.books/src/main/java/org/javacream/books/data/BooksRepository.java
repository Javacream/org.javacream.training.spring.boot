package org.javacream.books.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Component
public class BooksRepository {

    @PersistenceContext private EntityManager entityManager;

    @Transactional(propagation = Propagation.REQUIRED)
    public void save(String isbn, String title, int pages, double price){
        Book book = new Book(isbn, title, pages, price);
        entityManager.persist(book);
    }
    @Transactional(propagation = Propagation.REQUIRED)
    public void save(Book book){
        entityManager.persist(book);
    }//Transaction Commit für zur Synchronisation aller Attached Objekte

    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteByIsbn(String isbn){
        entityManager.remove(entityManager.getReference(Book.class, isbn));
    }
    @Transactional(propagation = Propagation.REQUIRED)
    public void update(Book book){
        entityManager.merge(book);
    }
    @Transactional(propagation = Propagation.REQUIRED)
    public Book findByIsbn(String isbn){
        return entityManager.find(Book.class, isbn);
    }
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Book> findByTitle(String title){
        TypedQuery<Book> query = entityManager.createQuery("select book from Book as book where book.title like :title", Book.class);
        query.setParameter("title", "%"  + title + "%");
        return query.getResultList();
    }

}
