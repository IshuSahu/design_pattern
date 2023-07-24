package beans;

import javax.persistence.*;


@Entity
public class Subject {
    @Id

    private int subjcode;
    private String subName;


//    @OneToOne(mappedBy = "subject")
//    private Faculty faculty;

    @ManyToOne
    private Faculty faculty;

    public Subject() {
    }

    public Subject(int subjcode, String subName) {
        this.subjcode = subjcode;
        this.subName = subName;
    }

    public int getSubjcode() {
        return subjcode;
    }

    public void setSubjcode(int subjcode) {
        this.subjcode = subjcode;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
}
