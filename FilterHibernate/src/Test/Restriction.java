package Test;
import Beans.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import java.util.Arrays;
import java.util.List;

public class Restriction{
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("Resources/hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        // Equal restriction
        List<Student> students = session.createCriteria(Student.class)
                .add(Restrictions.gt("stumarks", 80.0))
//                .add(Restrictions.le("sturollno", 104))
//                .add(Restrictions.between("stumarks", 70.0, 90.0))
//                .add(Restrictions.like("stuname", "Om%"))



                .list();

        for (Student student : students) {
            System.out.println("Student Details:");
            System.out.println("Roll No: " + student.getSturollno());
            System.out.println("Name: " + student.getStuname());
            System.out.println("Email: " + student.getStuemail());
            System.out.println("Marks: " + student.getStumarks());
            System.out.println();
        }


        session.close();
        sessionFactory.close();
    }
}