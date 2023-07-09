package Test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
public class PatientAggregate {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("resources/hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();


//        String hql = "SELECT SUM(p.fees) FROM Patient p";
//        Query<Double> query = session.createQuery(hql, Double.class);
//        Double totalFees = query.uniqueResult();
//        System.out.println("Total Fees: " + totalFees);4


//        String hql = "SELECT COUNT(p) FROM Patient p";
//        Query<Long> query = session.createQuery(hql, Long.class);
//        Long patientCount = query.uniqueResult();
//        System.out.println("Number of Patients: " + patientCount);

//        String hql = "SELECT AVG(p.fees) FROM Patient p";
//        Query<Double> query = session.createQuery(hql, Double.class);
//        Double averageFees = query.uniqueResult();
//        System.out.println("Average Fees: " + averageFees);


//        String hql = "SELECT MAX(p.fees) FROM Patient p";
//        Query<Double> query = session.createQuery(hql, Double.class);
//        Double highestFee = query.uniqueResult();
//        System.out.println("Highest Fee: " + highestFee);

        session.close();
        sessionFactory.close();
    }
}
