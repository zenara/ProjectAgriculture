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
@Table(name = "years")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Years.findAll", query = "SELECT y FROM Years y"),
    @NamedQuery(name = "Years.findByYearid", query = "SELECT y FROM Years y WHERE y.yearid = :yearid"),
    @NamedQuery(name = "Years.findByYearref", query = "SELECT y FROM Years y WHERE y.yearref = :yearref")})
public class Years implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "yearid")
    private Integer yearid;
    @Size(max = 20)
    @Column(name = "yearref")
    private String yearref;
    @OneToMany(mappedBy = "yearid", fetch = FetchType.LAZY)
    private List<Rainfedpaddy> rainfedpaddyList;
    @OneToMany(mappedBy = "yearid", fetch = FetchType.LAZY)
    private List<Majorpaddy> majorpaddyList;
    @OneToMany(mappedBy = "yearid", fetch = FetchType.LAZY)
    private List<Minorpaddy> minorpaddyList;

    public Years() {
    }

    public Years(Integer yearid) {
        this.yearid = yearid;
    }

    public Integer getYearid() {
        return yearid;
    }

    public void setYearid(Integer yearid) {
        this.yearid = yearid;
    }

    public String getYearref() {
        return yearref;
    }

    public void setYearref(String yearref) {
        this.yearref = yearref;
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
        hash += (yearid != null ? yearid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Years)) {
            return false;
        }
        Years other = (Years) object;
        if ((this.yearid == null && other.yearid != null) || (this.yearid != null && !this.yearid.equals(other.yearid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.cdms.project.orm.Years[ yearid=" + yearid + " ]";
    }
    
}
