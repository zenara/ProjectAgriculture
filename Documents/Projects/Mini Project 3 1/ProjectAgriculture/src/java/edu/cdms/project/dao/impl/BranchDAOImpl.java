/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cdms.project.dao.impl;

import edu.cdms.project.dao.BranchDAO;
import edu.cdms.project.orm.AdaZone;
import edu.cdms.project.orm.District;
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
    
    public boolean addAda(AdaZone adaZone) {
        Session session=getSession();
        session.beginTransaction();
        session.save(adaZone);
        session.getTransaction().commit();
        session.close();
        return false;
    }
    
    public ArrayList<AdaZone> getADAList(){
        Session session=getSession();
        session.beginTransaction();
        
        Query namedQuery=session.getNamedQuery("AdaZone.findAll");
        ArrayList<AdaZone> adaZones=(ArrayList<AdaZone>) namedQuery.list();
        session.getTransaction().commit();
        session.close();
        return adaZones;
    }

    public AdaZone getLastADA() {
        ArrayList<AdaZone> adaZones=getADAList();
        if(null==adaZones){
            adaZones=new ArrayList<AdaZone>();
        }
        if(adaZones.size()>0){
            return adaZones.get(adaZones.size()-1);
        }
        AdaZone adaZone=new AdaZone();
        adaZone.setAdaId("000");
        return adaZone;
        
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

    public District getLastDistrict() {
        ArrayList<District> districts=getDistrictList();
        if(null==districts){
            districts=new ArrayList<District>();
        }
        if(districts.size()>0){
            return districts.get(districts.size()-1);
        }
        District district=new District();
        district.setDistrictId("000");
        return district;
    }

    public boolean addDistrict(District district) {
        Session session=getSession();
        session.beginTransaction();
        session.save(district);
        session.getTransaction().commit();
        session.close();
        return false;
    }
    
   
}
