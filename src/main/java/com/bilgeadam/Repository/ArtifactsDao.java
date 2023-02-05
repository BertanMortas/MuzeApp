package com.bilgeadam.Repository;

import com.bilgeadam.Entity.Artifacts;
import com.bilgeadam.Entity.Exhibition;
import com.bilgeadam.Utils.Hibernate;
import org.hibernate.Session;

public class ArtifactsDao {
    public void save(Artifacts artifacts){
        try {
            Session session = Hibernate.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(artifacts);
            session.getTransaction().commit();
            session.close();
            System.out.println("kayıt başarılı");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}