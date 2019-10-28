package com.spring.mvc.test;

import com.spring.mvc.config.BookAopCgLibFactory;
import com.spring.mvc.config.BookAopProxyFactory;
import com.spring.mvc.entity.Book;
import com.spring.mvc.service.BookService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopBootTest1 {

    @Test
    public void test1 (){
        BookService bookService = BookAopProxyFactory.createService() ;
        Book book = new Book() ;
        book.setBookName("Spring实战");
        book.setAuthor("Craig Walls");
        bookService.addBook(book);
    }

    @Test
    public void test2 (){
        BookService bookService = BookAopCgLibFactory.createService() ;
        Book book = new Book() ;
        book.setBookName("MySQL");
        book.setAuthor("Baron");
        bookService.addBook(book);
    }

    @Test
    public void test3 (){
        String xmlPath = "spring-aop-half.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
        BookService bookService = (BookService) context.getBean("proxyFactory");
        Book book = new Book() ;
        book.setBookName("红楼梦");
        book.setAuthor("曹雪芹");
        bookService.addBook(book);
    }

    @Test
    public void test4 (){
        String xmlPath = "spring-aop-all.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
        BookService bookService = (BookService) context.getBean("bookService");
        Book book = new Book() ;
        book.setBookName("西游记");
        book.setAuthor("吴承恩");
        bookService.addBook(book);
    }

}
