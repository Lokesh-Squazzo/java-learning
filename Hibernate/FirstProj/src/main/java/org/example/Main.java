package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    static void main() {
        Student student = new Student();
        student.setId(102);
        student.setName("Jayesh");
        student.setCity("Shirpur");

        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(org.example.Student.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(student);
        transaction.commit();
    }
}
