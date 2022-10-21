package com.trial.ebpipelinedemo.Service.Implementation;

import com.trial.ebpipelinedemo.Model.Book;
import com.trial.ebpipelinedemo.Service.Interface.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service
@Slf4j
public class BookServiceImp implements BookService {
    @Override
    public List<Book> getBooks() {
        log.info("Inside getBooks() method in BookServiceImp with no parameters");
        return Stream.of(
                new Book(1, "Sherlock Holmes", "Arthur Conan Doyle"),
                new Book(2, "Lord of the rings", "J. R. R. Tolkien"),
                new Book(3, "Project Hail Mary", "Andy Weir"),
                new Book(4, "Diary of a wimpy kind", "Jeff Kinney")
        ).toList();
    }
}
