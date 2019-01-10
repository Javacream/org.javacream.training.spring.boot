package org.javacream.books.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
@Entity
public class Book implements Serializable {
    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", pages=" + pages +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (pages != book.pages) return false;
        if (Double.compare(book.price, price) != 0) return false;
        if (!isbn.equals(book.isbn)) return false;
        return title.equals(book.title);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = isbn.hashCode();
        result = 31 * result + title.hashCode();
        result = 31 * result + pages;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    @Id
    private String isbn;
    private String title;
    private int pages;
    private double price;

    public Book() {
    }

    public Book(String isbn, String title, int pages, double price) {
        this.isbn = isbn;
        this.title = title;
        this.pages = pages;
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
