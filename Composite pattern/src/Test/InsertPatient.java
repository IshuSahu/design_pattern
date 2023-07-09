package Test;

        import beans.Patient;
        import beans.NewPatient;
        import org.hibernate.Session;
        import org.hibernate.SessionFactory;
        import org.hibernate.Transaction;
        import org.hibernate.cfg.Configuration;

public class InsertPatient {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("resources/hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Patient P1 = new Patient(111, "Ishu", "Delhi", "Dr. B", 897);
        Patient P2 = new Patient(112, "Satyam", "Nagpur", "Dr. B", 498);
        Patient P3 = new Patient(113, "Yash", "Pune", "Dr. A", 458);

        session.save(P1);
        session.save(P2);
        session.save(P3);

        transaction.commit();
        session.close();
        sessionFactory.close();

    }
}
