package com.pelinhangisi.dataAccess.jdbc;

import com.pelinhangisi.dataAccess.CourseDao;
import com.pelinhangisi.entity.Course;

public class JdbcCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Jdbc ile veri tabanına eklendi : " + course.getName());
    }

}
