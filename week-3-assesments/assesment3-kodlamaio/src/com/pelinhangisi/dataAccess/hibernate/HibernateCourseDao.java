package com.pelinhangisi.dataAccess.hibernate;

import com.pelinhangisi.dataAccess.CourseDao;
import com.pelinhangisi.entity.Course;

public class HibernateCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile veri tabanına eklendi : " + course.getName());
    }

}
