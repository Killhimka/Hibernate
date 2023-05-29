package ru.javabegin.hibernate.main;

import org.hibernate.Session;
import ru.javabegin.hibernate.entity.Pets;
import ru.javabegin.hibernate.utils.HibernateSessionFactory;

public class AppMain {
    public static void main(String[] args) {
        System.out.println("Hibernate tutorial");

        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();

        Pets pets = new Pets();
        pets.setAnimal("Dog");
        pets.setAge(7);

        session.save(pets);
        session.getTransaction().commit();
        session.close();
    }
}
