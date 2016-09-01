/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cdms.project.dao.impl;

import edu.cdms.project.dao.BranchDAO;
import edu.cdms.project.orm.Adazone;
import edu.cdms.project.orm.Ascenter;
import edu.cdms.project.orm.District;
import edu.cdms.project.orm.Ds;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Chathurika Senani
 */
@Repository
public class BranchDAOImpl implements BranchDAO{

    @Autowired
    private SessionFactory sessionFactory;
    
    public Session getSession(){
        return sessionFactory.openSession();
    }
    
    public boolean addAda(Adazone adaZone) {
        Session session=getSession();
        session.beginTransaction();
        session.save(adaZone);
        session.getTransaction().commit();
        session.close();
        return false;
    }
    
    public ArrayList<Adazone> getADAList(){
        Session session=getSession();
        session.beginTransaction();
        
        Query namedQuery=session.getNamedQuery("Adazone.findAll");
        ArrayList<Adazone> adaZones=(ArrayList<Adazone>) namedQuery.list();
        session.getTransaction().commit();
        session.close();
        return adaZones;
    }

    
    public ArrayList<District> getDistrictList(){
        Session session=getSession();
        session.beginTransaction();
        
        Query namedQuery=session.getNamedQuery("District.findAll");
        ArrayList<District> districts=(ArrayList<District>) namedQuery.list();
        session.getTransaction().commit();
        session.close();
        return districts;
    }


    public boolean addDistrict(District district) {
        Session session=getSession();
        session.beginTransaction();
        session.save(district);
        session.getTransaction().commit();
        session.close();
        return false;
    }
    
    public ArrayList<Ds> getDsList(){
        Session session=getSession();
        session.beginTransaction();
        Query namedQuery=session.getNamedQuery("Ds.findAll");
        ArrayList<Ds> dses=(ArrayList<Ds>) namedQuery.list();
        session.getTransaction().commit();
        session.close();
        return dses;
    }

    public boolean addDs(Ds ds) {
        Session session=getSession();
        session.beginTransaction();
        session.save(ds);
        session.getTransaction().commit();
        session.close();
        return false;
    }
    
    public ArrayList<Ascenter> getAscenterList(){
        Session session=getSession();
        session.beginTransaction();
        Query namedQuery=session.getNamedQuery("Ascenter.findAll");
        ArrayList<Ascenter> ascenters=(ArrayList<Ascenter>) namedQuery.list();
        session.getTransaction().commit();
        session.close();
        return ascenters;
    }


    public boolean addAscenter(Ascenter ascenter) {
        Session session=getSession();
        session.beginTransaction();
        session.save(ascenter);
        session.getTransaction().commit();
        session.close();
        return false;
    }
      
   
}
