package com.programmer.mapper;

import com.programmer.pojo.Book;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * Created by FourWithTwo
 */

@Repository
@org.apache.ibatis.annotations.Mapper
public interface BookMapper extends Mapper<Book> {
}
