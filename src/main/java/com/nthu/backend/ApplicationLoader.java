package com.nthu.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nthu.backend.service.BookService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ApplicationLoader implements CommandLineRunner{
	
	@Autowired
	private BookService bookService;

	@Override
	public void run(String... args) throws Exception {
		try {
            bookService.getBook();
        } catch (Exception e) {
            e.printStackTrace();
        }
		
	}

}
