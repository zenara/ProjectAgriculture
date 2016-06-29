/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lms.project.service.impl;

import edu.lms.project.dao.MemberDAO;
import edu.lms.project.dto.LoginDTO;
import edu.lms.project.dto.MemberDTO;
import edu.lms.project.service.MemberService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Chathurika Senani
 */
@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberDAO memberDAO;

    public boolean addMember(MemberDTO memberDTO) {
        return memberDAO.addMember(memberDTO);
    }

    public MemberDTO getMember(LoginDTO loginDTO) {
        return memberDAO.getMember(loginDTO.getId());
//        return null;
    }

    public ArrayList<MemberDTO> getMemberList() {
        return memberDAO.getMemberList();
    }

}
