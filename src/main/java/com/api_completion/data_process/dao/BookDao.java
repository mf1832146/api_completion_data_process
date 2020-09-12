package com.api_completion.data_process.dao;

import com.api_completion.data_process.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookDao extends MongoRepository<Book, String> {
}
