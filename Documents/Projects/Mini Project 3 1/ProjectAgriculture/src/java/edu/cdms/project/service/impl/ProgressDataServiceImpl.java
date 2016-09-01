/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cdms.project.service.impl;

import edu.cdms.project.dao.ProgressDataDAO;
import edu.cdms.project.orm.Rainfedpaddy;
import edu.cdms.project.orm.Variety;
import edu.cdms.project.orm.Years;
import edu.cdms.project.service.ProgressDataService;
import java.time.Month;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Chathurika Senani
 */
@Service
public class ProgressDataServiceImpl implements ProgressDataService{
    @Autowired
    private ProgressDataDAO progressDataDAO;

    public boolean addRainfedProgress(Rainfedpaddy rainfedpaddy) {
        return progressDataDAO.addRainfedProgress(rainfedpaddy);
    }

    public ArrayList<Years> getYearList() {
        return progressDataDAO.getYearList();
    }

    public ArrayList<Month> getMonthList() {
        return progressDataDAO.getMonthList();
    }

    public ArrayList<Variety> getVarietyList() {
        return progressDataDAO.getVarietyList();
    }
}
