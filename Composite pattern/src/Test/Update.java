package Test;

import beans.Patient;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class Update {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("resources/hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();


        session.beginTransaction();
        String updateHql = "update Patient set name = :newName where id = :patientId";
        Query<?> updateQuery = session.createQuery(updateHql);
        updateQuery.setParameter("newName", "Ishu");
        updateQuery.setParameter("patientId", 105);
        int updatedCount = updateQuery.executeUpdate();
        session.getTransaction().commit();
        System.out.println("Updated " + updatedCount + " record(s)");


        session.close();
        sessionFactory.close();
    }
}
