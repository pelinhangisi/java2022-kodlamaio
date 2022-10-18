package com.pelinhangisi.dataAccess.jdbc;

import com.pelinhangisi.dataAccess.InstructorDao;
import com.pelinhangisi.entity.Instructor;

public class JdbcInstructorDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Jdbc ile veri tabanına kaydedildi: " + instructor.getFirstName()+ instructor.getLastName());
    }
}
