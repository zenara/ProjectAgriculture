/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cdms.project.contrl;

import edu.cdms.project.dto.AdminLoginDTO;
import edu.cdms.project.orm.Adazone;
import edu.cdms.project.orm.Admin;
import edu.cdms.project.orm.Ailist;
import edu.cdms.project.orm.Ascenter;
import edu.cdms.project.orm.District;
import edu.cdms.project.orm.Ds;
import edu.cdms.project.service.BranchService;
import edu.cdms.project.service.MemberService;
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
public class MemberController {

    @Autowired
    private MemberService memberService;

    @Autowired
    private BranchService branchService;

    @RequestMapping(value = "/adminlogin", method = RequestMethod.GET)
    public String adminlogin(ModelMap map) {
        AdminLoginDTO adminLoginDTO = new AdminLoginDTO();
        map.addAttribute("adminlogin", adminLoginDTO);
        return "adminLogin";
    }

    @RequestMapping(value = "/checkadmin", method = RequestMethod.POST)
    public String checkadmin(@Valid AdminLoginDTO adminLoginDTO, ModelMap map) {
        String enteredUName = adminLoginDTO.getUsername();
        Admin admin = memberService.getAdmin(adminLoginDTO);
        if (admin != null) {
            String enteredPass = adminLoginDTO.getPassword();
            if (enteredPass.equals(admin.getPassword())) {
                Ailist aiList = new Ailist();
                Adazone adaZone = new Adazone();
                map.addAttribute("AI", aiList);
                ArrayList<Adazone> adaZones = branchService.getADAList();
                map.addAttribute("ada", adaZone);
                map.addAttribute("adas", adaZones);
                District district = new District();
                map.addAttribute("district", district);
                ArrayList<District> districts = branchService.getDistrictList();
                map.addAttribute("districts", districts);
                Ds ds = new Ds();
                map.addAttribute("ds", ds);
                ArrayList<Ds> dses = branchService.getDsList();
                map.addAttribute("dses", dses);
                Ascenter ascenter = new Ascenter();
                map.addAttribute("ascenter", ascenter);
                ArrayList<Ascenter> ascenters = branchService.getAscenterList();
                map.addAttribute("centers", ascenters);
                return "addAI";
            }
        }
        map.addAttribute("msg", "error");
        map.addAttribute("adminlogin", adminLoginDTO);
        return "adminLogin";
    }

    @RequestMapping(value = "/addAI", method = RequestMethod.POST)
    public String addAI(@Valid Ailist aiList, ModelMap map) {
        if(aiList.getNic().matches("/^[0-9]{9}[vVxX]$/")){
            map.addAttribute("nicEr", "error");
        }
        try {
            memberService.addAI(aiList);
        } catch (Exception e) {
            map.addAttribute("msg", "error");
        }
            Adazone adaZone = new Adazone();
            map.addAttribute("AI", aiList);
            ArrayList<Adazone> adaZones = branchService.getADAList();
            map.addAttribute("ada", adaZone);
            map.addAttribute("adas", adaZones);
            District district = new District();
            map.addAttribute("district", district);
            ArrayList<District> districts = branchService.getDistrictList();
            map.addAttribute("districts", districts);
            Ds ds = new Ds();
            map.addAttribute("ds", ds);
            ArrayList<Ds> dses = branchService.getDsList();
            map.addAttribute("dses", dses);
            Ascenter ascenter = new Ascenter();
            map.addAttribute("ascenter", ascenter);
            ArrayList<Ascenter> ascenters = branchService.getAscenterList();
            map.addAttribute("centers", ascenters);
        return "addAI";
    }
}
