package com.mybook.easyread.entity;
import java.util.ArrayList;
import java.util.List;
public class User {
    private String name;
    private String email;
    private List<Book> purchasedBooks = new ArrayList<>();
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public void addPurchasedBook(Book book) {
        purchasedBooks.add(book);
    }

    public List<Book> getPurchasedBooks() {
        return purchasedBooks;
    }
}
