/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lms.project.dao.impl;

import edu.lms.project.dao.BookDetailDAO;
import edu.lms.project.dto.BookdetailDTO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Chathurika Senani
 */
@Repository
public class BookDetailDAOImpl implements BookDetailDAO{
    
    @Autowired
    private SessionFactory sessionFactory;
    
    public Session getSession(){
        return sessionFactory.openSession();
    }

    public boolean addDetail(BookdetailDTO bookdetailDTO) {
        Session currentSession=getSession();
        currentSession.beginTransaction();
        
        currentSession.save(bookdetailDTO);
        currentSession.getTransaction().commit();
        currentSession.close();
        return false;
    }
    
}
