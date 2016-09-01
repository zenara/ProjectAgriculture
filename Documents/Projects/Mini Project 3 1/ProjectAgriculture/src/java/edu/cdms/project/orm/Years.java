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
    @NamedQuery(name = "Years.findByYearId", query = "SELECT y FROM Years y WHERE y.yearId = :yearId"),
    @NamedQuery(name = "Years.findByYearRef", query = "SELECT y FROM Years y WHERE y.yearRef = :yearRef")})
public class Years implements Serializable {
    @OneToMany(mappedBy = "yearId", fetch = FetchType.LAZY)
    private List<Rainfedpaddy> rainfedpaddyList;
    @OneToMany(mappedBy = "yearId", fetch = FetchType.LAZY)
    private List<Minorpaddy> minorpaddyList;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "yearId")
    private Integer yearId;
    @Size(max = 20)
    @Column(name = "yearRef")
    private String yearRef;
    @OneToMany(mappedBy = "yearId", fetch = FetchType.LAZY)
    private List<Majorpaddy> majorpaddyList;

    public Years() {
    }

    public Years(Integer yearId) {
        this.yearId = yearId;
    }

    public Integer getYearId() {
        return yearId;
    }

    public void setYearId(Integer yearId) {
        this.yearId = yearId;
    }

    public String getYearRef() {
        return yearRef;
    }

    public void setYearRef(String yearRef) {
        this.yearRef = yearRef;
    }

    @XmlTransient
    public List<Majorpaddy> getMajorpaddyList() {
        return majorpaddyList;
    }

    public void setMajorpaddyList(List<Majorpaddy> majorpaddyList) {
        this.majorpaddyList = majorpaddyList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (yearId != null ? yearId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Years)) {
            return false;
        }
        Years other = (Years) object;
        if ((this.yearId == null && other.yearId != null) || (this.yearId != null && !this.yearId.equals(other.yearId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.cdms.project.orm.Years[ yearId=" + yearId + " ]";
    }

    @XmlTransient
    public List<Rainfedpaddy> getRainfedpaddyList() {
        return rainfedpaddyList;
    }

    public void setRainfedpaddyList(List<Rainfedpaddy> rainfedpaddyList) {
        this.rainfedpaddyList = rainfedpaddyList;
    }

    @XmlTransient
    public List<Minorpaddy> getMinorpaddyList() {
        return minorpaddyList;
    }

    public void setMinorpaddyList(List<Minorpaddy> minorpaddyList) {
        this.minorpaddyList = minorpaddyList;
    }
    
}
