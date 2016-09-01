/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cdms.project.contrl;

import edu.cdms.project.orm.Ailist;
import edu.cdms.project.orm.Majorpaddy;
import edu.cdms.project.orm.Minorpaddy;
import edu.cdms.project.orm.Rainfedpaddy;
import edu.cdms.project.orm.Variety;
import edu.cdms.project.orm.Years;
import edu.cdms.project.service.MemberService;
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

    @Autowired
    private MemberService memberService;

    @RequestMapping(value = "/AddsProgress", method = RequestMethod.GET)
    public String AddProgress(ModelMap map) {

        Rainfedpaddy rainfedpaddy = new Rainfedpaddy();
        map.addAttribute("rainfed", rainfedpaddy);

        Majorpaddy majorpaddy = new Majorpaddy();
        map.addAttribute("major", majorpaddy);

        Minorpaddy minorpaddy = new Minorpaddy();
        map.addAttribute("minor", minorpaddy);

        ArrayList<Years> years = progressDataService.getYearList();
        map.addAttribute("years", years);

        ArrayList<Month> monthses = progressDataService.getMonthList();
        map.addAttribute("months", monthses);

        ArrayList<Variety> varietys = progressDataService.getVarietyList();
        map.addAttribute("varieties", varietys);

        return "addProgress";
    }

    @RequestMapping(value = "viewAIList", method = RequestMethod.GET)
    public String ViewAIList(ModelMap map) {
        ArrayList<Ailist> aiLists = memberService.getAIList();
        map.addAttribute("ais", aiLists);
        return "ailistview";
    }
    
}
