/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lms.project.service.impl;

import edu.lms.project.dao.CategoryDAO;
import edu.lms.project.dto.CategoryDTO;
import edu.lms.project.service.CategoryService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Chathurika Senani
 */

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDAO categoryDAO;

    public ArrayList<CategoryDTO> getCategories() {
        return categoryDAO.getCatogories();
    }

}
