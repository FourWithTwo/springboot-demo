package com.programmer;

import com.programmer.mapper.BookMapper;
import com.programmer.mapper.CategoryMapper;
import com.programmer.pojo.Book;
import com.programmer.pojo.Category;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springboot02ApplicationTests {
	@Autowired
	private BookMapper bookMapper;
	@Autowired
	private CategoryMapper categoryMapper;

	@Test
	void contextLoads() {
		List<Book> bookList = bookMapper.selectAll();
		for (Book book : bookList) {
			Category category = categoryMapper.selectByPrimaryKey(book.getCid());
			book.setCatename(category.getCatename());
		}
		System.out.println("bookList = " + bookList);
	}

}
