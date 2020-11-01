package com.programmer.controller;

import com.programmer.pojo.Book;
import com.programmer.pojo.Result;
import com.programmer.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by FourWithTwo
 */
@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    //查询所有图书
    @RequestMapping("/findAllBook")
    public List<Book> findAll(){
        return bookService.findAll();
    }

    //新增图书
    @RequestMapping("/insertBook")
    public Result insertBook(@RequestBody Book book){
        return bookService.insertBook(book);
    }

    //修改图书
    @RequestMapping("/updateBook")
    public Result updateBook(@RequestBody Book book){
        return bookService.updateBook(book);
    }

    //删除图书
    @RequestMapping("/deleteBook")
    public Result deleteBook(int bid){
        return bookService.deleteBook(bid);
    }

    //根据类型找图书
    @RequestMapping("/findByBook")
    public List<Book> findByBook(int cid){
        return bookService.findByBook(cid);
    }
}
