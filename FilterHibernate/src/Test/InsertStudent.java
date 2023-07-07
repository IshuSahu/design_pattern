package Test;

import Beans.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertStudent {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("Resources/hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Student stu1 = new Student(101, "Tushar", "tushar@gmail.com", 78);
        Student stu2 = new Student(102, "Kunal", "kunal@gmail.com", 56);
        Student stu3 = new Student(103, "Om", "om@gmail.com", 84);
        Student stu4 = new Student(104, "Disha", "disha@gmail.com", 74);
        Student stu5 = new Student(105, "Vaidehi", "vaidehi@gmail.com", 59);
        Student stu6 = new Student(106, "Harshada", "harshada@gmail.com",45 );
        Student stu7 = new Student(107, "Jiza", "jiza@gmail.com", 23);

        session.save(stu1);
        session.save(stu2);
        session.save(stu3);
        session.save(stu4);
        session.save(stu5);
        session.save(stu6);
        session.save(stu7);

        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
