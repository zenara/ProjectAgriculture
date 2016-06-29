/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lms.project.service;

import edu.lms.project.dto.BookDTO;
import java.util.ArrayList;

/**
 *
 * @author Chathurika Senani
 */
public interface BookService {
    public boolean addBook(BookDTO bookDTO);
    
    public ArrayList<BookDTO> getBook();

        public BookDTO getBookLastId();

    public ArrayList<BookDTO> getSearchedBooks();

}
