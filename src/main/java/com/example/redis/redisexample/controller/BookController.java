package com.example.redis.redisexample.controller;

import com.example.redis.redisexample.entity.Book;
import com.example.redis.redisexample.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/books")
public class BookController {

    private final BookRepository bookRepository;

    @PostMapping
    public void saveNewBook(@RequestParam("bookName") String bookName) {
        bookRepository.save(Book.builder().id(UUID.randomUUID()).name(bookName).build());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBook(@PathVariable("id") UUID id) {
        return new ResponseEntity<>(bookRepository.findById(id).get(), HttpStatus.OK);
    }
}
