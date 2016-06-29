/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lms.project.service.impl;

import edu.lms.project.dao.BookDetailDAO;
import edu.lms.project.dto.BookdetailDTO;
import edu.lms.project.service.BookDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Chathurika Senani
 */
@Service
public class BookDetailServiceImpl implements BookDetailService{
    
    @Autowired BookDetailDAO bookDetailDAO;

    public boolean addDetail(BookdetailDTO bookdetailDTO) {
        return bookDetailDAO.addDetail(bookdetailDTO);
    }
    
}
