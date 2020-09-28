package com.example.redis.redisexample.repository;

import com.example.redis.redisexample.entity.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface BookRepository extends CrudRepository<Book, UUID> {
}
