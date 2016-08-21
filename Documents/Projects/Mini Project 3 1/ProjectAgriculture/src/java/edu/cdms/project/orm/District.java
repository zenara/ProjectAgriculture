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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Chathurika Senani
 */
@Entity
@Table(name = "district")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "District.findAll", query = "SELECT d FROM District d"),
    @NamedQuery(name = "District.findByDistrictId", query = "SELECT d FROM District d WHERE d.districtId = :districtId"),
    @NamedQuery(name = "District.findByDistrictName", query = "SELECT d FROM District d WHERE d.districtName = :districtName")})
public class District implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "districtId")
    private String districtId;
    @Size(max = 50)
    @Column(name = "districtName")
    private String districtName;
    @OneToMany(mappedBy = "districtId", fetch = FetchType.LAZY)
    private List<AiList> aiListList;
    @OneToMany(mappedBy = "districtId", fetch = FetchType.LAZY)
    private List<Ascenter> ascenterList;
    @JoinColumn(name = "adaId", referencedColumnName = "adaId")
    @ManyToOne(fetch = FetchType.LAZY)
    private AdaZone adaId;
    @OneToMany(mappedBy = "districtId", fetch = FetchType.LAZY)
    private List<Ds> dsList;

    public District() {
    }

    public District(String districtId) {
        this.districtId = districtId;
    }

    public String getDistrictId() {
        return districtId;
    }

    public void setDistrictId(String districtId) {
        this.districtId = districtId;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    @XmlTransient
    public List<AiList> getAiListList() {
        return aiListList;
    }

    public void setAiListList(List<AiList> aiListList) {
        this.aiListList = aiListList;
    }

    @XmlTransient
    public List<Ascenter> getAscenterList() {
        return ascenterList;
    }

    public void setAscenterList(List<Ascenter> ascenterList) {
        this.ascenterList = ascenterList;
    }

    public AdaZone getAdaId() {
        return adaId;
    }

    public void setAdaId(AdaZone adaId) {
        this.adaId = adaId;
    }

    @XmlTransient
    public List<Ds> getDsList() {
        return dsList;
    }

    public void setDsList(List<Ds> dsList) {
        this.dsList = dsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (districtId != null ? districtId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof District)) {
            return false;
        }
        District other = (District) object;
        if ((this.districtId == null && other.districtId != null) || (this.districtId != null && !this.districtId.equals(other.districtId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.cdms.project.orm.District[ districtId=" + districtId + " ]";
    }
    
}
