/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cdms.project.dao;

import edu.cdms.project.orm.AdaZone;
import edu.cdms.project.orm.District;
import java.util.ArrayList;

/**
 *
 * @author Chathurika Senani
 */
public interface BranchDAO {

    public boolean addAda(AdaZone adaZone);

    public AdaZone getLastADA();

    public ArrayList<AdaZone> getADAList();

    public District getLastDistrict();

    public boolean addDistrict(District district);

    public ArrayList<District> getDistrictList();
    
}
