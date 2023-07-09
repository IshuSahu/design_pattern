package Test;

import beans.Patient;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class Delete {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("resources/hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        String deleteHql = "delete from Patient where id = :patientId";
        Query<?> deleteQuery = session.createQuery(deleteHql);
        deleteQuery.setParameter("patientId", 105);
        int deletedCount = deleteQuery.executeUpdate();
        session.getTransaction().commit();
        System.out.println("Deleted " + deletedCount + " record(s)");

        session.close();
        sessionFactory.close();
    }
}
