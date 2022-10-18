package com.pelinhangisi;

import com.pelinhangisi.business.CategoryManager;
import com.pelinhangisi.business.CourseManager;
import com.pelinhangisi.business.InstructorManager;
import com.pelinhangisi.dataAccess.hibernate.HibernateCourseDao;
import com.pelinhangisi.dataAccess.jdbc.JdbcCategoryDao;
import com.pelinhangisi.dataAccess.jdbc.JdbcInstructorDao;
import com.pelinhangisi.entity.Category;
import com.pelinhangisi.entity.Course;
import com.pelinhangisi.entity.Instructor;
import com.pelinhangisi.logger.DatabaseLogger;
import com.pelinhangisi.logger.EmailLogger;
import com.pelinhangisi.logger.FileLogger;
import com.pelinhangisi.logger.Logger;

public class Main {

    public static void main(String[] args) throws Exception {

        Logger[] loggers = {new DatabaseLogger(), new EmailLogger(), new FileLogger()};

        Category category1 = new Category(4, "Mobile");
        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
        categoryManager.add(category1);

        Course course1 = new Course(4, "Project", "Examples", 75);
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
        courseManager.add(course1);

        Instructor instructor = new Instructor(1, "Engin", "Demiroğ");
        InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
        instructorManager.add(instructor);
    }
}
