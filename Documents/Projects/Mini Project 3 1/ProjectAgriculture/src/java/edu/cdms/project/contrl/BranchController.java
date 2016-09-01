/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cdms.project.contrl;

import edu.cdms.project.orm.Adazone;
import edu.cdms.project.orm.Ailist;
import edu.cdms.project.orm.Ascenter;
import edu.cdms.project.orm.District;
import edu.cdms.project.orm.Ds;
import edu.cdms.project.service.BranchService;
import java.util.ArrayList;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Chathurika Senani
 */
@Controller
@RequestMapping("/")
public class BranchController {
    
    @Autowired
    private BranchService branchService;
    
    @RequestMapping(value ="/addAda", method = RequestMethod.POST)
    public String addAda(@Valid Adazone adaZone, ModelMap map){
       
        branchService.addAda(adaZone);
        Ailist aiList=new Ailist();
        map.addAttribute("AI", aiList);
        map.addAttribute("ada", adaZone);
        ArrayList<Adazone> adaZones=branchService.getADAList();
        map.addAttribute("adas", adaZones);
        ArrayList<District> districts=branchService.getDistrictList();
        map.addAttribute("districts", districts);
        District district=new District();
        map.addAttribute("district", district);
        Ds ds=new Ds();
        map.addAttribute("ds", ds);
        Ascenter ascenter=new Ascenter();
        map.addAttribute("ascenter", ascenter);
        ArrayList<Ascenter> ascenters=branchService.getAscenterList();
        map.addAttribute("centers", ascenters);
        return "addAI";
    }
    
    @RequestMapping(value = "/addDistrict", method = RequestMethod.POST)
    public String addDistrict(@Valid District district, ModelMap map){
       
        branchService.addDistrict(district);
        Ailist aiList=new Ailist();
        map.addAttribute("AI", aiList);
        Adazone adaZone=new Adazone();
        map.addAttribute("ada", adaZone);
        ArrayList<Adazone> adaZones=branchService.getADAList();
        map.addAttribute("adas", adaZones);
        ArrayList<District> districts=branchService.getDistrictList();
        map.addAttribute("districts", districts);
        map.addAttribute("district", district);
        Ds ds=new Ds();
        map.addAttribute("ds", ds);
        Ascenter ascenter=new Ascenter();
        map.addAttribute("ascenter", ascenter);
        ArrayList<Ascenter> ascenters=branchService.getAscenterList();
        map.addAttribute("centers", ascenters);
        return "addAI";
    }
        
    @RequestMapping(value = "/addDS", method = RequestMethod.POST)
    public String addDS(@Valid Ds ds, ModelMap map){
        
        branchService.addDS(ds);
        Ailist aiList=new Ailist();
        map.addAttribute("AI", aiList);
        Adazone adaZone=new Adazone();
        map.addAttribute("ada", adaZone);
        ArrayList<Adazone> adaZones=branchService.getADAList();
        map.addAttribute("adas", adaZones);
        ArrayList<District> districts=branchService.getDistrictList();
        map.addAttribute("districts", districts);
        District district=new District();
        map.addAttribute("district", district);
        map.addAttribute("ds", ds);
        ArrayList<Ds> dses=branchService.getDsList();
        map.addAttribute("dses", dses);
        Ascenter ascenter=new Ascenter();
        map.addAttribute("ascenter", ascenter);
        ArrayList<Ascenter> ascenters=branchService.getAscenterList();
        map.addAttribute("centers", ascenters);
        return "addAI";
    }
    
    @RequestMapping(value = "/addAscenter", method = RequestMethod.POST)
    public String addAscenter(@Valid Ascenter ascenter, ModelMap map){
                
        branchService.addAscenter(ascenter);
        Ailist aiList=new Ailist();
        map.addAttribute("AI", aiList);
        Adazone adaZone=new Adazone();
        map.addAttribute("ada", adaZone);
        ArrayList<Adazone> adaZones=branchService.getADAList();
        map.addAttribute("adas", adaZones);
        ArrayList<District> districts=branchService.getDistrictList();
        map.addAttribute("districts", districts);
        District district=new District();
        map.addAttribute("district", district);
        Ds ds=new Ds();
        map.addAttribute("ds", ds);
        ArrayList<Ds> dses=branchService.getDsList();
        map.addAttribute("dses", dses);
        map.addAttribute("ascenter", ascenter);
        ArrayList<Ascenter> ascenters=branchService.getAscenterList();
        map.addAttribute("centers", ascenters);
        return "addAI";
    }
    
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(ModelMap map) {
        ArrayList<Adazone> adaZones=branchService.getADAList();
        map.addAttribute("adas", adaZones);
        ArrayList<District> districts=branchService.getDistrictList();
        map.addAttribute("districts", districts);
        District district=new District();
        map.addAttribute("district", district);
        return "test";
    }
    
}
