/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cdms.project.service;

import edu.cdms.project.orm.Adazone;
import edu.cdms.project.orm.Ascenter;
import edu.cdms.project.orm.District;
import edu.cdms.project.orm.Ds;
import java.util.ArrayList;

/**
 *
 * @author Chathurika Senani
 */
public interface BranchService {

    public boolean addAda(Adazone adaZone);

    public ArrayList<Adazone> getADAList();
    
    
    public boolean addDistrict(District district);
    
    public ArrayList<District> getDistrictList();
    
    
    public boolean addDS(Ds ds);
    
    public ArrayList<Ds> getDsList();
    
    
    public boolean addAscenter(Ascenter ascenter);
    
    public ArrayList<Ascenter> getAscenterList();
}
