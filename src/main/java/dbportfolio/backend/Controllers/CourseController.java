package dbportfolio.backend.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import dbportfolio.backend.Models.Course;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController("/api/courses")
@CrossOrigin("*")
public class CourseController {
    //test dasdf adsfas
    @GetMapping("/getAllCourses")
    public ResponseEntity<Course> getAllCourses() {
      // TODO document why this method is empty
    }

    @PostMapping()
}