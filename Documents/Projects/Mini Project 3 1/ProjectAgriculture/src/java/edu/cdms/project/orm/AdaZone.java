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
@Table(name = "ada_zone")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AdaZone.findAll", query = "SELECT a FROM AdaZone a"),
    @NamedQuery(name = "AdaZone.findByAdaId", query = "SELECT a FROM AdaZone a WHERE a.adaId = :adaId"),
    @NamedQuery(name = "AdaZone.findByAdaName", query = "SELECT a FROM AdaZone a WHERE a.adaName = :adaName")})
public class AdaZone implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "adaId")
    private String adaId;
    @Size(max = 50)
    @Column(name = "adaName")
    private String adaName;
    @OneToMany(mappedBy = "adaId", fetch = FetchType.LAZY)
    private List<AiList> aiListList;
    @OneToMany(mappedBy = "adaId", fetch = FetchType.LAZY)
    private List<District> districtList;

    public AdaZone() {
    }

    public AdaZone(String adaId) {
        this.adaId = adaId;
    }

    public String getAdaId() {
        return adaId;
    }

    public void setAdaId(String adaId) {
        this.adaId = adaId;
    }

    public String getAdaName() {
        return adaName;
    }

    public void setAdaName(String adaName) {
        this.adaName = adaName;
    }

    @XmlTransient
    public List<AiList> getAiListList() {
        return aiListList;
    }

    public void setAiListList(List<AiList> aiListList) {
        this.aiListList = aiListList;
    }

    @XmlTransient
    public List<District> getDistrictList() {
        return districtList;
    }

    public void setDistrictList(List<District> districtList) {
        this.districtList = districtList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (adaId != null ? adaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdaZone)) {
            return false;
        }
        AdaZone other = (AdaZone) object;
        if ((this.adaId == null && other.adaId != null) || (this.adaId != null && !this.adaId.equals(other.adaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.cdms.project.orm.AdaZone[ adaId=" + adaId + " ]";
    }
    
}
