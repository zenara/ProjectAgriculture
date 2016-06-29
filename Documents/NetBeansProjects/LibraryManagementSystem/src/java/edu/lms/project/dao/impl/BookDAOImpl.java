/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lms.project.dao.impl;

import edu.lms.project.dao.BookDAO;
import edu.lms.project.dto.BookDTO;
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
public class BookDAOImpl implements BookDAO {

    @Autowired
    SessionFactory sessionFactory;

    public Session getSession() {
        return sessionFactory.openSession();
    }

    public boolean addBook(BookDTO bookDTO) {
        Session currentSession = getSession();
        currentSession.beginTransaction();

        currentSession.save(bookDTO);
        currentSession.getTransaction().commit();
        currentSession.close();
        return false;
    }

    public ArrayList<BookDTO> getBook() {
        Session session = getSession();
        session.beginTransaction();

        Query namedQuery = session.getNamedQuery("BookDTO.findAll");
        ArrayList<BookDTO> bookDTOs = (ArrayList<BookDTO>) namedQuery.list();
        return bookDTOs;
    }

    public BookDTO getBookLastId() {
        ArrayList<BookDTO> book=getBook();
        if(null==book){
            book=new ArrayList<BookDTO>();
        }
        if(book.size()>0){
            return book.get(book.size()-1);
        }
        
        BookDTO bookDTO=new BookDTO();
        bookDTO.setBookId("000");
        return bookDTO;
    }

    public ArrayList<BookDTO> getSearchedBooks() {
        Session session=getSession();
        session.beginTransaction();
        
        Query namedQuery = session.getNamedQuery("BookDTO.findAll");
        ArrayList<BookDTO> searchedBookDTOs = (ArrayList<BookDTO>) namedQuery.list();
        return searchedBookDTOs;
    }

}
