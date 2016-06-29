/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lms.project.dao;

import edu.lms.project.dto.CategoryDTO;
import java.util.ArrayList;

/**
 *
 * @author Chathurika Senani
 */
public interface CategoryDAO {
    public ArrayList<CategoryDTO> getCatogories();
}
