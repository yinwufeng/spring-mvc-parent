package com.spring.mvc.service.impl;

import com.spring.mvc.entity.Book;
import com.spring.mvc.service.BookService;

public class BookServiceImpl implements BookService {
    @Override
    public void addBook(Book book) {
        System.out.println(book.getBookName());
        System.out.println(book.getAuthor());
    }
}
