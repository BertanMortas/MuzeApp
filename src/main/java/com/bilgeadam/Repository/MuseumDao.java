package com.bilgeadam.Repository;

import com.bilgeadam.Entity.Exhibition;
import com.bilgeadam.Entity.Museum;
import com.bilgeadam.Utils.Hibernate;
import org.hibernate.Session;

public class MuseumDao {
    public void save(Museum museum){
        try {
            Session session = Hibernate.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(museum);
            session.getTransaction().commit();
            session.close();
            System.out.println("kayıt başarılı");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}