package com.pelinhangisi.business;

import com.pelinhangisi.dataAccess.InstructorDao;
import com.pelinhangisi.entity.Instructor;
import com.pelinhangisi.logger.Logger;

public class InstructorManager {

    private InstructorDao instructorDao;
    private Logger[] loggers;

    public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor){
        instructorDao.add(instructor);
        for(Logger logger:loggers){
            logger.log(instructor.getFirstName()+ " " + instructor.getLastName());
        }
    }
}
