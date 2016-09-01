/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cdms.project.dao.impl;

import edu.cdms.project.dao.ProgressDataDAO;
import edu.cdms.project.orm.Majorpaddy;
import edu.cdms.project.orm.Minorpaddy;
import edu.cdms.project.orm.Rainfedpaddy;
import edu.cdms.project.orm.Variety;
import edu.cdms.project.orm.Years;
import java.time.Month;
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
public class ProgressDataDAOImpl implements ProgressDataDAO{
    
    @Autowired SessionFactory sessionFactory;
    
    public Session getSession(){
        return sessionFactory.openSession();
    }

    public boolean addRainfedProgress(Rainfedpaddy rainfedpaddy) {
        Session session=getSession();
        session.beginTransaction();
        session.save(rainfedpaddy);
        session.getTransaction().commit();
        session.close();
        return false;
    }

    public ArrayList<Years> getYearList() {
        Session session=getSession();
        session.beginTransaction();
        Query namedQuery=session.getNamedQuery("Years.findAll");
        ArrayList<Years> yearses=(ArrayList<Years>) namedQuery.list();
        session.getTransaction().commit();
        session.close();
        return yearses;
    }
    
    public ArrayList<Month> getMonthList() {
        Session session=getSession();
        session.beginTransaction();
        Query namedQuery=session.getNamedQuery("Months.findAll");
        ArrayList<Month> months=(ArrayList<Month>) namedQuery.list();
        session.getTransaction().commit();
        session.close();
        return months;
    }
    
    public ArrayList<Variety> getVarietyList() {
        Session session=getSession();
        session.beginTransaction();
        Query namedQuery=session.getNamedQuery("Variety.findAll");
        ArrayList<Variety> varietys=(ArrayList<Variety>) namedQuery.list();
        session.getTransaction().commit();
        session.close();
        return varietys;
    }

    public boolean addMajorProgress(Majorpaddy majorpaddy) {
        Session session=getSession();
        session.beginTransaction();
        session.save(majorpaddy);
        session.getTransaction().commit();
        session.close();
        return false;
    }

    public boolean addMinorProgress(Minorpaddy minorpaddy) {
        Session session=getSession();
        session.beginTransaction();
        session.save(minorpaddy);
        session.getTransaction().commit();
        session.close();
        return false;
    }
    
}
