package com.trial.ebpipelinedemo.Controller;

import com.trial.ebpipelinedemo.Model.Book;
import com.trial.ebpipelinedemo.Service.Interface.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/status")
    public String getStatus(){
        log.info("Inside getStatus() method in BookController with no parameters");
        return "Successfully Deployed and Running!";
    }

    @GetMapping("/get/books")
    public List<Book> getBooks(){
       log.info("Inside getBooks() method in BookController with no parameters");
       log.info("hello");
       return bookService.getBooks();
    }
}
