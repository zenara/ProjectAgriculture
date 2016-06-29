/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lms.project.dao;

import edu.lms.project.dto.MemberDTO;
import java.util.ArrayList;

/**
 *
 * @author Chathurika Senani
 */
public interface MemberDAO {
    public boolean addMember(MemberDTO memberDTO);

    public MemberDTO getMember(String memberId);

    public ArrayList<MemberDTO> getMemberList();
}
