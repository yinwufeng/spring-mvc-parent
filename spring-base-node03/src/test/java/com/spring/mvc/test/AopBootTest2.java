package com.spring.mvc.test;


import com.spring.mvc.entity.Book;
import com.spring.mvc.service.AuthorService;
import com.spring.mvc.service.BookService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopBootTest2 {

    @Test
    public void test1 (){
        String xmlPath = "spring-aop-aspectj-01.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
        BookService bookService = (BookService) context.getBean("bookService");
        Book book = new Book() ;
        book.setBookName("三国演义");
        book.setAuthor("罗贯中");
        bookService.addBook(book);
    }

    @Test
    public void test2 (){
        String xmlPath = "spring-aop-aspectj-02.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
        AuthorService authorService = (AuthorService) context.getBean("authorService");
        System.out.println("作者："+authorService.getAuthor());
    }
}
