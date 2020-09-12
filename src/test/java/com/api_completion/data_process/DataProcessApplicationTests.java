package com.api_completion.data_process;

import com.api_completion.data_process.dao.BookDao;
import com.api_completion.data_process.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DataProcessApplicationTests {

    @Autowired
    private BookDao bookDao;

    @Test
    void contextLoads() {
        Book book = new Book();
        book.setId("1234");
        bookDao.save(book);

        List<Book> bookList = bookDao.findAll();
        System.out.println(bookList);
    }

}
