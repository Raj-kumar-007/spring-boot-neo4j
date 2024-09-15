package com.company.spring_boot_neo4j.services;

import com.company.spring_boot_neo4j.models.Course;
import com.company.spring_boot_neo4j.repositories.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;

    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }

}
