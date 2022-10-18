package com.pelinhangisi.business;

import com.pelinhangisi.dataAccess.CourseDao;
import com.pelinhangisi.entity.Course;
import com.pelinhangisi.logger.Logger;

public class CourseManager {

    private CourseDao courseDao;
    private Logger[] loggers;

    public CourseManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception {
        Course[] courses = {new Course(1,"Java", "Backend Programming Course", 60),
                            new Course(2, "JavaScript", "Frontend Programming Course", 50),
                            new Course(3,"Java", "Game Development Projects", 75)};
        for(Course course1 : courses){
            if(course.getName() == course1.getName()){
                throw new Exception("Kurs ismi tekrar edemez");
            }else if(course.getPrice() < 0){
                throw new Exception("Bir kursun fiyatı 0 dan küçük olamaz");
            }
        }
        courseDao.add(course);
        for(Logger logger : loggers){
            logger.log("Kurs kaydedildi");
        }
    }
}
