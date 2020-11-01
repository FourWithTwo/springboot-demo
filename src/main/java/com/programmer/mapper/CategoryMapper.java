package com.programmer.mapper;

import com.programmer.pojo.Category;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * Created by FourWithTwo
 */
@Repository
@org.apache.ibatis.annotations.Mapper
public interface CategoryMapper extends Mapper<Category> {
}
