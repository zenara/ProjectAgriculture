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
    @NamedQuery(name = "Variety.findByVarietyId", query = "SELECT v FROM Variety v WHERE v.varietyId = :varietyId"),
    @NamedQuery(name = "Variety.findByVarietyName", query = "SELECT v FROM Variety v WHERE v.varietyName = :varietyName")})
public class Variety implements Serializable {
    @OneToMany(mappedBy = "varietyId", fetch = FetchType.LAZY)
    private List<Rainfedpaddy> rainfedpaddyList;
    @OneToMany(mappedBy = "varietyId", fetch = FetchType.LAZY)
    private List<Minorpaddy> minorpaddyList;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "varietyId")
    private Integer varietyId;
    @Size(max = 50)
    @Column(name = "varietyName")
    private String varietyName;
    @JoinColumn(name = "ageGroupId", referencedColumnName = "ageGroupId")
    @ManyToOne(fetch = FetchType.LAZY)
    private AgeGroup ageGroupId;
    @OneToMany(mappedBy = "varietyId", fetch = FetchType.LAZY)
    private List<Majorpaddy> majorpaddyList;

    public Variety() {
    }

    public Variety(Integer varietyId) {
        this.varietyId = varietyId;
    }

    public Integer getVarietyId() {
        return varietyId;
    }

    public void setVarietyId(Integer varietyId) {
        this.varietyId = varietyId;
    }

    public String getVarietyName() {
        return varietyName;
    }

    public void setVarietyName(String varietyName) {
        this.varietyName = varietyName;
    }

    public AgeGroup getAgeGroupId() {
        return ageGroupId;
    }

    public void setAgeGroupId(AgeGroup ageGroupId) {
        this.ageGroupId = ageGroupId;
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
        hash += (varietyId != null ? varietyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Variety)) {
            return false;
        }
        Variety other = (Variety) object;
        if ((this.varietyId == null && other.varietyId != null) || (this.varietyId != null && !this.varietyId.equals(other.varietyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.cdms.project.orm.Variety[ varietyId=" + varietyId + " ]";
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
