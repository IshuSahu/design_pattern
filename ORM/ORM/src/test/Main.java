package test;

import beans.Faculty;
import beans.Subject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("resources/hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();



//        Subject s1 = new Subject(111, "Data Structures and Algorithm ");
//        Subject s2 = new Subject(109, "Deep Psychology");
//
//
//        Faculty f1 = new Faculty(101, "Btech", "Engineering", s1);
//        Faculty f2 = new Faculty(102, "MBBS", "Medical", s2);
//
//        session.save(s1);
//        session.save(f1);
//        session.save(s2);
//        session.save(f2);

        Faculty f1 = new Faculty();
        f1.setId(107);
        f1.setName("mca");
        f1.setFaculty_type("computer science");


        Subject s1 = new Subject();
        s1.setSubjcode(100);
        s1.setSubName("DSA");
        s1.setFaculty(f1);

        Subject s2 = new Subject();
        s2.setSubjcode(101);
        s2.setSubName("C# USING DOT NET");
        s2.setFaculty(f1);


        f1.getSubject().add(s1);
        f1.getSubject().add(s2);


        session.save(s1);
        session.save(s2);
        session.save(f1);

        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
