package dbportfolio.backend.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PROJECT_TABLE")
public class Project {
    @Id
    @GeneratedValue
    @Column(name = "PROJECT_ID")
    private Integer id;

    @Column(name = "PROJECT_NAME", nullable = false)
    private String name;

    @Column(name = "PROJECT_DESC", nullable = false)
    private String description;

    @Column(name = "PROJECT_IMAGE", nullable = true, length = 1000)
    private byte[] image;

    @Column(name = "PROJECT_LINK", nullable = true)
    private String link;
 
    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Project() {
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }    
}