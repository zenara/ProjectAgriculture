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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "variety")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Variety.findAll", query = "SELECT v FROM Variety v"),
    @NamedQuery(name = "Variety.findByVarietyid", query = "SELECT v FROM Variety v WHERE v.varietyid = :varietyid"),
    @NamedQuery(name = "Variety.findByVarietyname", query = "SELECT v FROM Variety v WHERE v.varietyname = :varietyname")})
public class Variety implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "varietyid")
    private Integer varietyid;
    @Size(max = 50)
    @Column(name = "varietyname")
    private String varietyname;
    @OneToMany(mappedBy = "varietyid", fetch = FetchType.LAZY)
    private List<Rainfedpaddy> rainfedpaddyList;
    @OneToMany(mappedBy = "varietyid", fetch = FetchType.LAZY)
    private List<Majorpaddy> majorpaddyList;
    @JoinColumn(name = "agegroupid", referencedColumnName = "agegroupid")
    @ManyToOne(fetch = FetchType.LAZY)
    private Agegroup agegroupid;
    @OneToMany(mappedBy = "varietyid", fetch = FetchType.LAZY)
    private List<Minorpaddy> minorpaddyList;

    public Variety() {
    }

    public Variety(Integer varietyid) {
        this.varietyid = varietyid;
    }

    public Integer getVarietyid() {
        return varietyid;
    }

    public void setVarietyid(Integer varietyid) {
        this.varietyid = varietyid;
    }

    public String getVarietyname() {
        return varietyname;
    }

    public void setVarietyname(String varietyname) {
        this.varietyname = varietyname;
    }

    @XmlTransient
    public List<Rainfedpaddy> getRainfedpaddyList() {
        return rainfedpaddyList;
    }

    public void setRainfedpaddyList(List<Rainfedpaddy> rainfedpaddyList) {
        this.rainfedpaddyList = rainfedpaddyList;
    }

    @XmlTransient
    public List<Majorpaddy> getMajorpaddyList() {
        return majorpaddyList;
    }

    public void setMajorpaddyList(List<Majorpaddy> majorpaddyList) {
        this.majorpaddyList = majorpaddyList;
    }

    public Agegroup getAgegroupid() {
        return agegroupid;
    }

    public void setAgegroupid(Agegroup agegroupid) {
        this.agegroupid = agegroupid;
    }

    @XmlTransient
    public List<Minorpaddy> getMinorpaddyList() {
        return minorpaddyList;
    }

    public void setMinorpaddyList(List<Minorpaddy> minorpaddyList) {
        this.minorpaddyList = minorpaddyList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (varietyid != null ? varietyid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Variety)) {
            return false;
        }
        Variety other = (Variety) object;
        if ((this.varietyid == null && other.varietyid != null) || (this.varietyid != null && !this.varietyid.equals(other.varietyid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.cdms.project.orm.Variety[ varietyid=" + varietyid + " ]";
    }
    
}
