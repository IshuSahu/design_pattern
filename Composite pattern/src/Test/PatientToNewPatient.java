package Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class PatientToNewPatient {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("resources/hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        String hql = "insert into NewPatient(id, name, address, doctor, fees) select id, name, address, doctor, fees from Patient";
        int i = 0;
        try {
            Query query = session.createQuery(hql);
            i = query.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        System.out.println("Number of rows inserted into NewPatient from OldPatient: " + i);

        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
