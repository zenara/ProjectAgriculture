/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cdms.project.dao;

import edu.cdms.project.orm.Admin;
import edu.cdms.project.orm.Ailist;
import java.util.ArrayList;

/**
 *
 * @author Chathurika Senani
 */
public interface MemberDAO {
    public Admin getAdmin(String adminUName);

    public boolean addAI(Ailist aiList);

    public ArrayList<Ailist> getAIList();
}
