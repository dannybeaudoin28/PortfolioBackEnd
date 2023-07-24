package dbportfolio.backend.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dbportfolio.backend.Models.Project;
import dbportfolio.backend.Repositories.ProjectRepo;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepo projectRepo;

    public ArrayList<Project> getAllProjects() {
        return (ArrayList<Project>) this.projectRepo.findAll();
    }
    
}
