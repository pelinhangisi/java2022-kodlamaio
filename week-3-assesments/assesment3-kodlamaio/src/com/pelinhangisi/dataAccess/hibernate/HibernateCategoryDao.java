package com.pelinhangisi.dataAccess.hibernate;

import com.pelinhangisi.dataAccess.CategoryDao;
import com.pelinhangisi.entity.Category;

public class HibernateCategoryDao implements CategoryDao {
    @Override
    public void add(Category category){
        System.out.println("Hibernate ile veri tabanına kaydedildi : " + category.getName());
    }

}
