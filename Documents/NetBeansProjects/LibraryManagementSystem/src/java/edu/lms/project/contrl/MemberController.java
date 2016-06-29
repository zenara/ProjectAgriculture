/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lms.project.contrl;

import edu.lms.project.dto.LoginDTO;
import edu.lms.project.dto.MemberDTO;
import edu.lms.project.service.MemberService;
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

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String loadSignup(ModelMap map) {
        MemberDTO memberDTO = new MemberDTO();
        map.addAttribute("membersignup", memberDTO);
        return "signup";
    }

    @RequestMapping(value = "/addmember", method = RequestMethod.POST)
    public String addMember(@Valid MemberDTO memberDTO, ModelMap map) {
        memberDTO.setMemberId("0016");

        String password = memberDTO.getPassword();

        if (password.length() < 6) {
            map.addAttribute("msg", "PASSWORD");
            map.addAttribute("membersignup", memberDTO);
            return "signup";
        }

        memberService.addMember(memberDTO);
        return "home";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginMeber(ModelMap map) {
        LoginDTO loginDTO = new LoginDTO();
        map.addAttribute("memberlogin", loginDTO);
        return "login";
    }

    @RequestMapping(value = "/checkmember", method = RequestMethod.POST)
    public String addMember(@Valid LoginDTO loginDTO, ModelMap map) {
        String memberId = loginDTO.getId();

        MemberDTO member = memberService.getMember(loginDTO);
        if (member != null) {
            String password = loginDTO.getPassword();
            if (password.equals(member.getPassword())) {
                return "home";
            }
        }
        map.addAttribute("msg", "PASSWORD");
        map.addAttribute("memberlogin", loginDTO);
        return "login";
    }
    
    @RequestMapping(value = "/viewmembers", method = RequestMethod.GET)
    public String viewMembers(ModelMap map){
        ArrayList<MemberDTO> memberDTOs=memberService.getMemberList();
        map.addAttribute("memberlist", memberDTOs);
        return "members";
    }
    
    

}
