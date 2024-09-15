package com.company.spring_boot_neo4j.repositories;

import com.company.spring_boot_neo4j.models.Course;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends Neo4jRepository<Course, Long> {

}
