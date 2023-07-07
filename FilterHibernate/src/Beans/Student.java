package Beans;

public class Student {
    private int sturollno;
    private String stuname;
    private String stuemail;
    private double stumarks;

    public Student() {
    }

    public Student(int sturollno, String stuname, String stuemail, double stumarks) {
        this.sturollno = sturollno;
        this.stuname = stuname;
        this.stuemail = stuemail;
        this.stumarks = stumarks;
    }

    public int getSturollno() {
        return sturollno;
    }

    public void setSturollno(int sturollno) {
        this.sturollno = sturollno;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public String getStuemail() {
        return stuemail;
    }

    public void setStuemail(String stuemail) {
        this.stuemail = stuemail;
    }

    public double getStumarks() {
        return stumarks;
    }

    public void setStumarks(double stumarks) {
        this.stumarks = stumarks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sturollno=" + sturollno +
                ", stuname='" + stuname + '\'' +
                ", stuemail='" + stuemail + '\'' +
                ", stumarks=" + stumarks +
                '}';
    }
}
