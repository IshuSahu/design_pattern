package Test;

import beans.Patient;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class Select {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("resources/hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        String selectHql = "from Patient";
        Query<Patient> selectQuery = session.createQuery(selectHql, Patient.class);
        List<Patient> patientList = selectQuery.list();

        for (Patient patient : patientList) {
            System.out.println("***********************************************************");
            System.out.println("Id: " + patient.getId());
            System.out.println("Name: " + patient.getName());
            System.out.println("Address: " + patient.getAddress());
            System.out.println("Doctor: " + patient.getDoctor());
            System.out.println("Fees: " + patient.getFees());
        }

        session.close();
        sessionFactory.close();
    }
}
