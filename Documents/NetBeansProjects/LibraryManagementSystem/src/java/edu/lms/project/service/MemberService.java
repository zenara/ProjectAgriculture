/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lms.project.service;

import edu.lms.project.dto.LoginDTO;
import edu.lms.project.dto.MemberDTO;
import java.util.ArrayList;

/**
 *
 * @author Chathurika Senani
 */
public interface MemberService {
    public boolean addMember(MemberDTO memberDTO);
    
    public MemberDTO getMember(LoginDTO loginDTO);

    public ArrayList<MemberDTO> getMemberList();
}
