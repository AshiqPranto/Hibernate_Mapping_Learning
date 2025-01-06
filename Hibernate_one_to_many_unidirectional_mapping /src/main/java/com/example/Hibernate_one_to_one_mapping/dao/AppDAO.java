package com.example.Hibernate_one_to_one_mapping.dao;


import com.example.Hibernate_one_to_one_mapping.entity.Course;
import com.example.Hibernate_one_to_one_mapping.entity.Instructor;
import com.example.Hibernate_one_to_one_mapping.entity.InstructorDetail;

import java.util.List;

public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorById(int theId);

    InstructorDetail findInstructorDetailById(int theId);

    void deleteInstructorDetailById(int theId);

    List<Course> findCoursesByInstructorId(int theId);

    Instructor findInstructorByIdJoinFetch(int theId);

    void update(Instructor tempInstructor);

    void update(Course tempCourse);

    Course findCourseById(int theId);

    void deleteCourseById(int theId);
}













