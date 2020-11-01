package com.programmer.service;

import com.programmer.pojo.Book;
import com.programmer.pojo.Result;

import java.util.List;

/**
 * Created by FourWithTwo
 */
public interface BookService {
    List<Book> findAll();

    Result insertBook(Book book);

    Result updateBook(Book book);

    Result deleteBook(int bid);

    List<Book> findByBook(int cid);

}
