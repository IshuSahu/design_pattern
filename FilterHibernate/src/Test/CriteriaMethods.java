package Test;

import Beans.Student;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class CriteriaMethods {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("Resources/hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(Student.class);

        criteria.setFirstResult(1);
        criteria.setMaxResults(3);
        List<Student> list = criteria.list();

        for (Student stu : list) {
            System.out.println("Student list is : " + stu.toString());
        }
    }
}