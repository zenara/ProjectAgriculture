/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cdms.project.service.impl;

import edu.cdms.project.dao.BranchDAO;
import edu.cdms.project.orm.AdaZone;
import edu.cdms.project.orm.District;
import edu.cdms.project.service.BranchService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Chathurika Senani
 */
@Service
public class BranchServiceImpl implements BranchService{

    @Autowired
    private BranchDAO branchDAO;
    
    public boolean addAda(AdaZone adaZone) {
        return branchDAO.addAda(adaZone);
    }

    public AdaZone getLastADA() {
        return branchDAO.getLastADA();
    }

    public ArrayList<AdaZone> getADAList() {
        return branchDAO.getADAList();
    }
    
    public boolean addDistrict(District district){
        return branchDAO.addDistrict(district);
    }

    public District getLastDistrict() {
        return branchDAO.getLastDistrict();
    }

    public ArrayList<District> getDistrictList() {
        return branchDAO.getDistrictList();
    }
    
}
