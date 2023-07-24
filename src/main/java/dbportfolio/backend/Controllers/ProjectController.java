package dbportfolio.backend.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import dbportfolio.backend.Models.Course;
import dbportfolio.backend.Models.Project;
import dbportfolio.backend.Services.ProjectService;

@RestController("/projects")
@CrossOrigin(origins = "*")
public class ProjectController {
    @Autowired()
    private ProjectService projectService;

    @GetMapping("/getAllCourses")
    public ResponseEntity<List<Project>> getAllProjects() {
      List projects = (List) projectService.getAllProjects();
      if(projects.size() > 0) {
        return new ResponseEntity<List<Project>>(projects, HttpStatus.OK);
      }
      return new ResponseEntity<List<Project>>(HttpStatus.BAD_REQUEST);
    }
}
