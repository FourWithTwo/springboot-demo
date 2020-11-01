package com.programmer.service.impl;

import com.programmer.mapper.BookMapper;
import com.programmer.mapper.CategoryMapper;
import com.programmer.pojo.Book;
import com.programmer.pojo.BookExample;
import com.programmer.pojo.Category;
import com.programmer.pojo.Result;
import com.programmer.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by FourWithTwo
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;
    @Autowired
    private CategoryMapper categoryMapper;

    //查询所有图书
    @Override
    public List<Book> findAll() {
        List<Book> bookList = bookMapper.selectAll();
        for (Book book : bookList) {
            Category category = categoryMapper.selectByPrimaryKey(book.getCid());
            book.setCatename(category.getCatename());
        }
        return bookList;
    }

    //新增图书
    @Override
    public Result insertBook(Book book) {
        Result result = null;
        try {
            bookMapper.insertSelective(book);
            result = new Result(true, "添加成功!");
        } catch (Exception e) {
            result = new Result(false, "添加失败!");
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public Result updateBook(Book book) {
        Result result = null;
        try {
            bookMapper.updateByPrimaryKeySelective(book);
            result = new Result(true, "修改成功!");
        } catch (Exception e) {
            result = new Result(false, "修改失败!");
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public Result deleteBook(int bid) {
        Result result = null;
        try {
            bookMapper.deleteByPrimaryKey(bid);
            result = new Result(true, "删除成功!");
        } catch (Exception e) {
            result = new Result(false, "删除失败!");
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<Book> findByBook(int cid) {
        //获得查询实例
        BookExample bookExample = new BookExample();
        //获得查询条件
        BookExample.Criteria criteria = bookExample.createCriteria();
        //添加条件
        criteria.andCidEqualTo(cid);
        //查询
        List<Book> bookList = bookMapper.selectByExample(bookExample);
        for (Book book : bookList) {
            Category category = categoryMapper.selectByPrimaryKey(book.getCid());
            book.setCatename(category.getCatename());
        }
        return bookList;
    }
}
