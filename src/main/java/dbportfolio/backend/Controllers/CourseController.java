package dbportfolio.backend.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import dbportfolio.backend.Models.Course;
import dbportfolio.backend.Services.CourseService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController("/api/courses")
@CrossOrigin("*")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/getAllCourses")
    public ResponseEntity<List<Course>> getAllCourses() {
      List courses = (List) courseService.getAllCourses();
      if(courses.size() > 0) {
        return new ResponseEntity<List<Course>>(courses, HttpStatus.OK);
      }
      return new ResponseEntity<List<Course>>(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/postCourse")
    public ResponseEntity<Integer> postCourse (@RequestBody Course course) {
      courseService.addCourse(course);
      return new ResponseEntity<Integer>(course.getId(), HttpStatus.OK);
    }

    @GetMapping("/getCourse/{id}")
    public ResponseEntity<Course> getCourseById(@PathVariable Integer id) {
      Course course = courseService.getCourseById(id);
      if(course.getName() != null) {
        return new ResponseEntity<Course>(course, HttpStatus.OK);
      }
      return new ResponseEntity<Course>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/deleteCourse")
    public ResponseEntity<Integer> deleteCourseById(@PathVariable Integer id) {
      if(courseService.deleteCourseById(id)) {
        return new ResponseEntity<Integer>(HttpStatus.OK);
      }
      return new ResponseEntity<Integer>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/courses/{id}")
    public ResponseEntity<Void> updateCourse(@PathVariable Integer id, @RequestBody Course newCourse) {
      if(courseService.updateCourse(newCourse, id) != null) {
        return new ResponseEntity<>(HttpStatus.OK);
      }
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}