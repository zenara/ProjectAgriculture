/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lms.project.service.impl;

import edu.lms.project.dao.BookDAO;
import edu.lms.project.dto.BookDTO;
import edu.lms.project.service.BookService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Chathurika Senani
 */
@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookDAO bookDAO;
    
    public boolean addBook(BookDTO bookDTO) {
        return bookDAO.addBook(bookDTO);
    }
    
    public ArrayList<BookDTO> getBook(){
        return bookDAO.getBook();
    }

    public BookDTO getBookLastId() {
        return bookDAO.getBookLastId();
    }

    public ArrayList<BookDTO> getSearchedBooks() {
        return bookDAO.getSearchedBooks();
    }
    
}
