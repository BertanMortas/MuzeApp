package com.bilgeadam.Utils;

import com.bilgeadam.Entity.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernate {
    private static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory(){
        if (sessionFactory == null){
            try {
                Configuration configuration = new Configuration();
                configuration.addAnnotatedClass(Museum.class);
                configuration.addAnnotatedClass(Exhibition.class);
                configuration.addAnnotatedClass(Visitor.class);
                configuration.addAnnotatedClass(Artist.class);
                configuration.addAnnotatedClass(Artifacts.class);
                sessionFactory = configuration.configure("Hibernate.cfg.xml").buildSessionFactory();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }
}
