package com.mybook.easyread.entity;

import java.util.ArrayList;
import java.util.List;

// Book Class
public class Book {
    private String title;
    private String author;
    private String isbn;
    private String content;
    private double price;

    public Book(String title, String author, String isbn, String content, double price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.content = content;
        this.price = price;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getISBN() { return isbn; }
    public String getContent() { return content; }
    public double getPrice() { return price; }
}