package com.example.Hibernate_one_to_one_mapping.dao;


import com.example.Hibernate_one_to_one_mapping.entity.Instructor;
import com.example.Hibernate_one_to_one_mapping.entity.InstructorDetail;

public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorById(int theId);

    InstructorDetail findInstructorDetailById(int theId);

    void deleteInstructorDetailById(int theId);

}












