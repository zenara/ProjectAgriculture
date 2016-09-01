/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cdms.project.service;

import edu.cdms.project.orm.Majorpaddy;
import edu.cdms.project.orm.Minorpaddy;
import edu.cdms.project.orm.Rainfedpaddy;
import edu.cdms.project.orm.Variety;
import edu.cdms.project.orm.Years;
import java.time.Month;
import java.util.ArrayList;

/**
 *
 * @author Chathurika Senani
 */
public interface ProgressDataService {
    public boolean addRainfedProgress(Rainfedpaddy rainfedpaddy);
    
    public boolean addMajorProgress(Majorpaddy majorpaddy);
    
    public boolean addMinorProgress(Minorpaddy minorpaddy);
    
    public ArrayList<Years> getYearList();
    
    public ArrayList<Month> getMonthList();  
        
    public ArrayList<Variety> getVarietyList();
}
