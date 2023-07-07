package Test;

import Beans.Student;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

import java.util.List;

public class SelectProjection {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("Resources/hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(Student.class);

        Projection projection = Projections.property("stuname");
        criteria.setProjection(projection);

        List<String> Stunamelist = criteria.list();

        for (String stuname : Stunamelist) {
            System.out.println(stuname);
        }

        session.close();
        sessionFactory.close();
    }
}

