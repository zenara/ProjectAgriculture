/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lms.project.dao.impl;

import edu.lms.project.dao.MemberDAO;
import edu.lms.project.dto.MemberDTO;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Chathurika Senani
 */
@Repository
public class MemberDAOImpl implements MemberDAO {
    @Autowired
    private SessionFactory sessionFactory;
    
    public Session getSession(){
        return sessionFactory.openSession();
    }
    
    public boolean addMember(MemberDTO memberDTO) {
        Session currentSession = getSession();
        currentSession.beginTransaction();
        
        currentSession.save(memberDTO);
        
        currentSession.getTransaction().commit();
        currentSession.close();
        return false;
    }

    public MemberDTO getMember(String memberId) {
        Session session = getSession();
        Query namedQuery = session.getNamedQuery("MemberDTO.findByMemberId");
        namedQuery.setString("memberId", memberId);
        ArrayList<MemberDTO> list = (ArrayList<MemberDTO>) namedQuery.list();
        
        MemberDTO memberDTO = null;
        if (list.size() > 0) {
            memberDTO = list.get(0);
        }
        
        return memberDTO;
    }

    public ArrayList<MemberDTO> getMemberList() {
        Session session=getSession();
        Query namedQuery=session.getNamedQuery("MemberDTO.findAll");
        ArrayList<MemberDTO> memberDTOs=(ArrayList<MemberDTO>) namedQuery.list();
        return memberDTOs;
    }

}
