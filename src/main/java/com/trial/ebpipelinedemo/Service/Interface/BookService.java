package com.trial.ebpipelinedemo.Service.Interface;

import com.trial.ebpipelinedemo.Model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    List<Book> getBooks();
}
