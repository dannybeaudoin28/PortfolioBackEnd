package dbportfolio.backend.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "COURSE_TABLE")
public class Course {
    @Id
    @GeneratedValue
    @Column(name = "COURSE_ID")
    private Integer id;

    @Column(name = "COURSE_NAME")
    private String name;

    @Column(name = "COURSE_DESC")
    private String desc;

    @Column(name = "COURSE_YEAR")
    private String year;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Course(String name, String desc, String year) {
        this.name = name;
        this.desc = desc;
        this.year = year;
    }
}
