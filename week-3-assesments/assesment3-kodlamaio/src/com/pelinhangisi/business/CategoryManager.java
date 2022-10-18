package com.pelinhangisi.business;

import com.pelinhangisi.dataAccess.CategoryDao;
import com.pelinhangisi.entity.Category;
import com.pelinhangisi.logger.Logger;

public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void add(Category category) throws Exception {
        Category[] categories = {new Category(1,"Backend"),new Category(2,"Frontend"),new Category(3,"Game Development") };
        for(Category category1 : categories){
            if(category.getName() == category1.getName()){
                throw new Exception("Kategori ismi tekrar edemez.");
            }
        }
        categoryDao.add(category);
        for(Logger logger:loggers){
            logger.log("Kategori kaydedildi.");
        }
    }
}
