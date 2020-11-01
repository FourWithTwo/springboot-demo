package com.programmer.controller;

import com.programmer.pojo.Category;
import com.programmer.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by FourWithTwo
 */
@RestController
@RequestMapping("/cate")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/findAllCate")
    public List<Category> findAll(){
        return categoryService.findAll();
    }
}
