package org.javacream.books.rest;

import org.javacream.books.data.Book;
import org.javacream.books.data.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BooksWebService {

    @Autowired
    private BooksService booksService;
    @PostMapping(path = "books", consumes = MediaType.APPLICATION_JSON_VALUE) public void updateBook(@RequestBody Book book){
        booksService.saveBook(book);
    }
    @PutMapping(path = "books", consumes = MediaType.APPLICATION_JSON_VALUE) public void saveBook(@RequestBody Book book){
        booksService.updateBook(book);
    }
    @GetMapping(path = "books/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE) public Book findBook(@PathVariable("isbn") String isbn){
        return booksService.findBookByIsbn(isbn);
    }
    @GetMapping(path = "books/title/{title}", produces = MediaType.APPLICATION_JSON_VALUE) public List<Book> findBooksByTitle(@PathVariable("title") String title){
        return booksService.findBooksByTitle(title);
    }
    @DeleteMapping(path = "books/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE) public void deleteBook(@PathVariable("isbn") String isbn){
        booksService.deleteBookByIsbn(isbn);
    }
}
