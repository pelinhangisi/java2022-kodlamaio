package com.pelinhangisi.dataAccess.jdbc;

import com.pelinhangisi.dataAccess.CategoryDao;
import com.pelinhangisi.entity.Category;

public class JdbcCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Jdbc ile veri tabanına kaydedildi : " + category.getName());
    }

}
