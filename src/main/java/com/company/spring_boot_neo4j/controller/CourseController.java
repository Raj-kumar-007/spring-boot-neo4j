package com.company.spring_boot_neo4j.controller;

import com.company.spring_boot_neo4j.models.Course;
import com.company.spring_boot_neo4j.services.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/courses")
@AllArgsConstructor
public class CourseController {

    private final CourseService courseService;

    @GetMapping("/")
    public ResponseEntity<List<Course>> getAll(){
        return  new ResponseEntity<>(courseService.getAllCourses(), HttpStatus.OK);
    }
}
