/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lms.project.dao.impl;

import edu.lms.project.dao.CategoryDAO;
import edu.lms.project.dto.CategoryDTO;
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
public class CategoryDAOImpl implements CategoryDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public Session getSession() {
        return sessionFactory.openSession();
    }

    public ArrayList<CategoryDTO> getCatogories() {
        Session session = getSession();
        session.beginTransaction();
        Query namedQuery = session.getNamedQuery("CategoryDTO.findAll");
        ArrayList<CategoryDTO> categoryDTOs = (ArrayList<CategoryDTO>) namedQuery.list();
        session.getTransaction().commit();
        session.close();
        return categoryDTOs;
    }

}
