package com.pelinhangisi.dataAccess.hibernate;

import com.pelinhangisi.dataAccess.InstructorDao;
import com.pelinhangisi.entity.Instructor;

public class HibernateInstructorDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Hibernate ile veri tabanına eklendi : " + instructor.getFirstName()+ instructor.getLastName());
    }
}
