package net.javaguides.springboot.controller;

import net.javaguides.springboot.entities.Course;
import net.javaguides.springboot.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class MyController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/home")
    public String home() {
        return "WELCOME TO COURSES APPLICATION";
    }
    //@GetMapping("/courses")
    //public List<Course> getCourses() {
    //    return this.courseService.getCourses();

    @GetMapping("/courses")
    ResponseEntity<List<Course>> getCourses() {
        List<Course> courses = courseService.getCourses();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("info","GETTING ALL COURSES");
        httpHeaders.add("desc","RETRIEVE COURSE FROM DATABASES");
        ResponseEntity<List<Course>> entity = new ResponseEntity<>(courses,httpHeaders, HttpStatus.OK);
        return entity;
    }
    

    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId)
    {
        return this.courseService.getCourse(Long.parseLong(courseId));
    }
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course)
    {
        return this.courseService.addCourse(course);
    }
    @PutMapping("/courses/{courseId}")
    public Course updateCourse(@RequestBody Course course, @PathVariable long courseId) {
        course.setId(courseId);
        return this.courseService.updateCourse(course);
    }

    @DeleteMapping("/courses/{courseId}")
    public void deleteCourse(@PathVariable long courseId) {
        this.courseService.deleteCourse(courseId);
    }

}
