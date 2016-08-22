/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cdms.project.service;

import edu.cdms.project.orm.AdaZone;
import edu.cdms.project.orm.Ascenter;
import edu.cdms.project.orm.District;
import edu.cdms.project.orm.Ds;
import java.util.ArrayList;

/**
 *
 * @author Chathurika Senani
 */
public interface BranchService {

    public boolean addAda(AdaZone adaZone);

    public AdaZone getLastADA();
    
    public ArrayList<AdaZone> getADAList();
    
    
    public boolean addDistrict(District district);
    
    public District getLastDistrict();
    
    public ArrayList<District> getDistrictList();
    
    
    public boolean addDS(Ds ds);
    
    public Ds getLastDs();
    
    public ArrayList<Ds> getDsList();
    
    
    public Ascenter getLastAscenter();

    public boolean addAscenter(Ascenter ascenter);
    
    public ArrayList<Ascenter> getAscenterList();
}
