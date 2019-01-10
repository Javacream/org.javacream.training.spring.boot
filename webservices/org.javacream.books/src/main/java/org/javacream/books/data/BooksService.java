package org.javacream.books.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class BooksService {
    @Autowired BooksRepository booksRepository;
    @Autowired BookUtility bookUtility;

    @Transactional(propagation = Propagation.REQUIRED)
    public void saveBook(Book book){
            booksRepository.save(book);
            bookUtility.log("created book " + book);
    }
    @Transactional(propagation = Propagation.REQUIRED)
    public void updateBook(Book book){
        booksRepository.update(book);
        bookUtility.log("updated book " + book);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteBookByIsbn(String isbn){
            booksRepository.deleteByIsbn(isbn);
            bookUtility.log("deleted book " + isbn);
    }
    @Transactional(propagation = Propagation.REQUIRED)
    public Book findBookByIsbn(String isbn){
        Book book = booksRepository.findByIsbn(isbn);
        bookUtility.log("searched book " + book);
        return book;
    }
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Book> findBooksByTitle(String title){
        List<Book> books = booksRepository.findByTitle(title);
        bookUtility.log("searched books " + books);
        return books;
    }

}
