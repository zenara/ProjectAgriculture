/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cdms.project.orm;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Chathurika Senani
 */
@Entity
@Table(name = "agegroup")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Agegroup.findAll", query = "SELECT a FROM Agegroup a"),
    @NamedQuery(name = "Agegroup.findByAgegroupid", query = "SELECT a FROM Agegroup a WHERE a.agegroupid = :agegroupid"),
    @NamedQuery(name = "Agegroup.findByAgegroupname", query = "SELECT a FROM Agegroup a WHERE a.agegroupname = :agegroupname")})
public class Agegroup implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "agegroupid")
    private Integer agegroupid;
    @Size(max = 50)
    @Column(name = "agegroupname")
    private String agegroupname;
    @OneToMany(mappedBy = "agegroupid", fetch = FetchType.LAZY)
    private List<Variety> varietyList;

    public Agegroup() {
    }

    public Agegroup(Integer agegroupid) {
        this.agegroupid = agegroupid;
    }

    public Integer getAgegroupid() {
        return agegroupid;
    }

    public void setAgegroupid(Integer agegroupid) {
        this.agegroupid = agegroupid;
    }

    public String getAgegroupname() {
        return agegroupname;
    }

    public void setAgegroupname(String agegroupname) {
        this.agegroupname = agegroupname;
    }

    @XmlTransient
    public List<Variety> getVarietyList() {
        return varietyList;
    }

    public void setVarietyList(List<Variety> varietyList) {
        this.varietyList = varietyList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agegroupid != null ? agegroupid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Agegroup)) {
            return false;
        }
        Agegroup other = (Agegroup) object;
        if ((this.agegroupid == null && other.agegroupid != null) || (this.agegroupid != null && !this.agegroupid.equals(other.agegroupid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.cdms.project.orm.Agegroup[ agegroupid=" + agegroupid + " ]";
    }
    
}
