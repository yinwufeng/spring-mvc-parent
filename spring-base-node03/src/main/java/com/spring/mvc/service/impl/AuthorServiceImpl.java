package com.spring.mvc.service.impl;

import com.spring.mvc.service.AuthorService;
import org.springframework.stereotype.Service;

@Service("authorService")
public class AuthorServiceImpl implements AuthorService {

    @Override
    public String getAuthor() {
        System.out.println("【作者：知了一笑】");
        return "知了一笑";
    }

}
