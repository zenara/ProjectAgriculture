/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cdms.project.contrl;

import edu.cdms.project.orm.Months;
import edu.cdms.project.orm.Rainfedpaddy;
import edu.cdms.project.orm.Variety;
import edu.cdms.project.orm.Years;
import edu.cdms.project.service.ProgressDataService;
import java.time.Month;
import java.util.ArrayList;
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
public class HomeController {
    
    @Autowired
    private ProgressDataService progressDataService;
    
    @RequestMapping(value = "AddProgress",method = RequestMethod.GET)
    public String AddProgress(ModelMap map){
        
        Rainfedpaddy rainfedpaddy=new Rainfedpaddy();
        map.addAttribute("rainfed", rainfedpaddy);
        
        ArrayList<Years> years=progressDataService.getYearList();
        map.addAttribute("years", years);
        
        ArrayList<Month> monthses=progressDataService.getMonthList();
        map.addAttribute("months", monthses);
        
        ArrayList<Variety> varietys=progressDataService.getVarietyList();
        map.addAttribute("varieties", varietys);
        
        return "addProgress";
    }
    
}
