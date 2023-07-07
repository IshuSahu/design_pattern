package Test;

import Beans.Student;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

public class AggregateProjectionFunction {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("Resources/hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(Student.class);

        Projection projection = Projections.sum("stumarks");
        criteria.setProjection(projection);
        Double sum = (Double) criteria.uniqueResult();
        System.out.println("Sum of student marks: " + sum);

//        Projection projection = Projections.avg("stumarks");
//        criteria.setProjection(projection);
//        double stumarks = (Double) criteria.uniqueResult();
//        System.out.println("Maximum Salary : " + stumarks);

//        Projection projection = Projections.min("stumarks");
//        criteria.setProjection(projection);
//        double minstumarks = (Double) criteria.uniqueResult();
//        System.out.println("Average Student marks : " + minstumarks);


//        Projection projection = Projections.max("stumarks");
//        criteria.setProjection(projection);
//        double maxstumarks = (Double) criteria.uniqueResult();
//        System.out.println("Maximum Salary : " + maxstumarks);

//        Projection projection = Projections.count("stuname");
//        criteria.setProjection(projection);
//        long stuCount = (Long) criteria.uniqueResult();
//        System.out.println("Count of employee : " + stuCount);

        session.close();
        sessionFactory.close();
    }
}
