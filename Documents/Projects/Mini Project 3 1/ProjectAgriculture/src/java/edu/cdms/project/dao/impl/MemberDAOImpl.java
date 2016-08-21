/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cdms.project.dao.impl;

import edu.cdms.project.dao.MemberDAO;
import edu.cdms.project.dto.AdminLoginDTO;
import edu.cdms.project.orm.Admin;
import edu.cdms.project.orm.AiList;
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
public class MemberDAOImpl implements MemberDAO{
    @Autowired
    private SessionFactory sessionFactory;
    
    public Session getSession(){
        return sessionFactory.openSession();
    }

    public Admin getAdmin(String adminUName) {
        Session session=getSession();
        Query query=session.getNamedQuery("Admin.findByUsername");
        query.setString("username", adminUName);
        
        ArrayList<Admin> list=(ArrayList<Admin>) query.list();
        Admin admin=null;
        if(list.size()>0){
            admin=list.get(0);
        }
        return admin;
    }

    public boolean addAI(AiList aiList) {
        Session session=getSession();
        session.beginTransaction();
        session.save(aiList);
        session.getTransaction().commit();
        session.close();
        return false;
    }
    
}
