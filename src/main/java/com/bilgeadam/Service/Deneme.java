package com.bilgeadam.Service;

import com.bilgeadam.Entity.Artifacts;
import com.bilgeadam.Entity.Artist;
import com.bilgeadam.Entity.Exhibition;
import com.bilgeadam.Entity.Museum;
import com.bilgeadam.Repository.ArtifactsDao;
import com.bilgeadam.Repository.ExhibitionDao;
import com.bilgeadam.Repository.MuseumDao;
import com.bilgeadam.Utils.Hibernate;

import java.util.Arrays;

public class Deneme {
    public static void main(String[] args) {
        Museum museum1 = new Museum("denemeMuze","Ankara","1994");
        Artist artist = new Artist("ayşe","1994","2002");
        Artist artist2 = new Artist("ali","34","2002");
        Artist artist3 = new Artist("kaya","49","1780");
        Artifacts artifacts1 = new Artifacts("ok","12234",artist);
        Artifacts artifacts2 = new Artifacts("book","456",artist2);
        Artifacts artifacts3 = new Artifacts("hamlet","12",artist3);
        Exhibition exhibition = new Exhibition("Deneme","2022","2023",museum1, Arrays.asList(artifacts1));

        ExhibitionDao exhibitionDao = new ExhibitionDao();
        //exhibitionDao.save(exhibition);

        ArtifactsDao artifactsDao= new ArtifactsDao();
       // artifactsDao.save(artifacts1);

        MuseumDao museumDao = new MuseumDao();

        Exhibition exhibition2 = new Exhibition("Deneme","2022","2023", Arrays.asList(artifacts2));
        Exhibition exhibition3 = new Exhibition("Deneme","2022","2023", Arrays.asList(artifacts1,artifacts3));
        Museum museum2 = new Museum("muze2","istanbul","1890",Arrays.asList(exhibition2,exhibition3));

        museumDao.save(museum2);
    }
}
