package beans;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Faculty {
    @Id
    private int id;
    private String name;

    private String faculty_type;

//    @OneToOne

//    private Subject subject;


    @OneToMany(mappedBy = "faculty")
    private List<Subject> subject = new ArrayList<>();

    public Faculty() {
    }

    public Faculty(int id, String name, String faculty_type, Subject subject) {
        this.id = id;
        this.name = name;
        this.faculty_type = faculty_type;
//        this.subject = subject;
       this.subject = (List<Subject>) subject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty_type() {
        return faculty_type;
    }

    public void setFaculty_type(String faculty_type) {
        this.faculty_type = faculty_type;
    }

//    public Subject getSubject() {
//        return subject;
//    }

 //   public void setSubject(Subject subject) {
 //       this.subject = subject;
//    }


   public List<Subject> getSubject() {
        return subject;
    }

   public void setSubject(List<Subject> subject) {
        this.subject = subject;
    }
}
