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
@Table(name = "age_group")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AgeGroup.findAll", query = "SELECT a FROM AgeGroup a"),
    @NamedQuery(name = "AgeGroup.findByAgeGroupId", query = "SELECT a FROM AgeGroup a WHERE a.ageGroupId = :ageGroupId"),
    @NamedQuery(name = "AgeGroup.findByAgeGroupName", query = "SELECT a FROM AgeGroup a WHERE a.ageGroupName = :ageGroupName")})
public class AgeGroup implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ageGroupId")
    private Integer ageGroupId;
    @Size(max = 50)
    @Column(name = "ageGroupName")
    private String ageGroupName;
    @OneToMany(mappedBy = "ageGroupId", fetch = FetchType.LAZY)
    private List<Variety> varietyList;

    public AgeGroup() {
    }

    public AgeGroup(Integer ageGroupId) {
        this.ageGroupId = ageGroupId;
    }

    public Integer getAgeGroupId() {
        return ageGroupId;
    }

    public void setAgeGroupId(Integer ageGroupId) {
        this.ageGroupId = ageGroupId;
    }

    public String getAgeGroupName() {
        return ageGroupName;
    }

    public void setAgeGroupName(String ageGroupName) {
        this.ageGroupName = ageGroupName;
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
        hash += (ageGroupId != null ? ageGroupId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgeGroup)) {
            return false;
        }
        AgeGroup other = (AgeGroup) object;
        if ((this.ageGroupId == null && other.ageGroupId != null) || (this.ageGroupId != null && !this.ageGroupId.equals(other.ageGroupId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.cdms.project.orm.AgeGroup[ ageGroupId=" + ageGroupId + " ]";
    }
    
}
