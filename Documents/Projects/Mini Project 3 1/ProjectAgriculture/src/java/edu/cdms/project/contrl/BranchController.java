/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cdms.project.contrl;

import edu.cdms.project.orm.AdaZone;
import edu.cdms.project.orm.AiList;
import edu.cdms.project.orm.Ascenter;
import edu.cdms.project.orm.District;
import edu.cdms.project.orm.Ds;
import edu.cdms.project.service.BranchService;
import java.text.NumberFormat;
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
    public String addAda(@Valid AdaZone adaZone, ModelMap map){
        AdaZone lastADA=branchService.getLastADA();
        int lastADAId=Integer.parseInt(lastADA.getAdaId());
        NumberFormat numberFormat=NumberFormat.getNumberInstance();
        numberFormat.setGroupingUsed(false);
        numberFormat.setMinimumIntegerDigits(3);
        
        adaZone.setAdaId(numberFormat.format(lastADAId+1));
        
        branchService.addAda(adaZone);
        AiList aiList=new AiList();
        map.addAttribute("AI", aiList);
        map.addAttribute("ada", adaZone);
        ArrayList<AdaZone> adaZones=branchService.getADAList();
        map.addAttribute("adas", adaZones);
        ArrayList<District> districts=branchService.getDistrictList();
        map.addAttribute("districts", districts);
        District district=new District();
        map.addAttribute("district", district);
        Ds ds=new Ds();
        map.addAttribute("ds", ds);
        return "addAI";
    }
    
    @RequestMapping(value = "/addDistrict", method = RequestMethod.POST)
    public String addDistrict(@Valid District district, ModelMap map){
        District lastDistrict=branchService.getLastDistrict();
        int lastDistrictId=Integer.parseInt(lastDistrict.getDistrictId());
        NumberFormat numberFormat=NumberFormat.getNumberInstance();
        numberFormat.setGroupingUsed(false);
        numberFormat.setMinimumIntegerDigits(3);
        
        district.setDistrictId(numberFormat.format(lastDistrictId+1));
        
        branchService.addDistrict(district);
        AiList aiList=new AiList();
        map.addAttribute("AI", aiList);
        AdaZone adaZone=new AdaZone();
        map.addAttribute("ada", adaZone);
        ArrayList<AdaZone> adaZones=branchService.getADAList();
        map.addAttribute("adas", adaZones);
        ArrayList<District> districts=branchService.getDistrictList();
        map.addAttribute("districts", districts);
        map.addAttribute("district", district);
        Ds ds=new Ds();
        map.addAttribute("ds", ds);
        return "addAI";
    }
        
    @RequestMapping(value = "/addDS", method = RequestMethod.POST)
    public String addDS(@Valid Ds ds, ModelMap map){
        Ds lastDs=branchService.getLastDs();
        int lastDsId=Integer.parseInt(lastDs.getDsId());
        NumberFormat numberFormat=NumberFormat.getNumberInstance();
        numberFormat.setGroupingUsed(false);
        numberFormat.setMinimumIntegerDigits(3);
        
        ds.setDsId(numberFormat.format(lastDsId+1));
        
        branchService.addDS(ds);
        AiList aiList=new AiList();
        map.addAttribute("AI", aiList);
        AdaZone adaZone=new AdaZone();
        map.addAttribute("ada", adaZone);
        ArrayList<AdaZone> adaZones=branchService.getADAList();
        map.addAttribute("adas", adaZones);
        ArrayList<District> districts=branchService.getDistrictList();
        map.addAttribute("districts", districts);
        District district=new District();
        map.addAttribute("district", district);
        map.addAttribute("ds", ds);
        ArrayList<Ds> dses=branchService.getDsList();
        map.addAttribute("dses", dses);
        return "addAI";
    }
    
    @RequestMapping(value = "/addAscenter", method = RequestMethod.POST)
    public String addAscenter(@Valid Ascenter ascenter, ModelMap map){
        Ascenter lastAscenter=branchService.getLastAscenter();
        int lastAscId=Integer.parseInt(lastAscenter.getAscId());
        NumberFormat numberFormat=NumberFormat.getNumberInstance();
        numberFormat.setGroupingUsed(false);
        numberFormat.setMinimumIntegerDigits(3);
        
        ascenter.setAscId(numberFormat.format(lastAscId+1));
        
        branchService.addAscenter(ascenter);
        AiList aiList=new AiList();
        map.addAttribute("AI", aiList);
        AdaZone adaZone=new AdaZone();
        map.addAttribute("ada", adaZone);
        ArrayList<AdaZone> adaZones=branchService.getADAList();
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
    
}
