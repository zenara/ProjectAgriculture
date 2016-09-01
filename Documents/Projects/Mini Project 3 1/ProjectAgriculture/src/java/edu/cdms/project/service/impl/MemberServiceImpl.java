/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cdms.project.service.impl;

import edu.cdms.project.dao.MemberDAO;
import edu.cdms.project.dto.AdminLoginDTO;
import edu.cdms.project.orm.Admin;
import edu.cdms.project.orm.Ailist;
import edu.cdms.project.service.MemberService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Chathurika Senani
 */
@Service
public class MemberServiceImpl implements MemberService{
    
    @Autowired
    private MemberDAO memberDAO;

    public Admin getAdmin(AdminLoginDTO adminLoginDTO) {
        return memberDAO.getAdmin(adminLoginDTO.getUsername());
    }

    public boolean addAI(Ailist aiList) {
        return memberDAO.addAI(aiList);
    }

    public ArrayList<Ailist> getAIList() {
        return memberDAO.getAIList();
    }
    
}
