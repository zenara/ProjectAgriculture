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
@Table(name = "ds")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ds.findAll", query = "SELECT d FROM Ds d"),
    @NamedQuery(name = "Ds.findByDsId", query = "SELECT d FROM Ds d WHERE d.dsId = :dsId"),
    @NamedQuery(name = "Ds.findByDsName", query = "SELECT d FROM Ds d WHERE d.dsName = :dsName")})
public class Ds implements Serializable {
    @OneToMany(mappedBy = "dsId", fetch = FetchType.LAZY)
    private List<AiList> aiListList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "dsId")
    private String dsId;
    @Size(max = 50)
    @Column(name = "dsName")
    private String dsName;
    @OneToMany(mappedBy = "dsId", fetch = FetchType.LAZY)
    private List<Ascenter> ascenterList;
    @JoinColumn(name = "districtId", referencedColumnName = "districtId")
    @ManyToOne(fetch = FetchType.LAZY)
    private District districtId;

    public Ds() {
    }

    public Ds(String dsId) {
        this.dsId = dsId;
    }

    public String getDsId() {
        return dsId;
    }

    public void setDsId(String dsId) {
        this.dsId = dsId;
    }

    public String getDsName() {
        return dsName;
    }

    public void setDsName(String dsName) {
        this.dsName = dsName;
    }

    @XmlTransient
    public List<Ascenter> getAscenterList() {
        return ascenterList;
    }

    public void setAscenterList(List<Ascenter> ascenterList) {
        this.ascenterList = ascenterList;
    }

    public District getDistrictId() {
        return districtId;
    }

    public void setDistrictId(District districtId) {
        this.districtId = districtId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dsId != null ? dsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ds)) {
            return false;
        }
        Ds other = (Ds) object;
        if ((this.dsId == null && other.dsId != null) || (this.dsId != null && !this.dsId.equals(other.dsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.cdms.project.orm.Ds[ dsId=" + dsId + " ]";
    }

    @XmlTransient
    public List<AiList> getAiListList() {
        return aiListList;
    }

    public void setAiListList(List<AiList> aiListList) {
        this.aiListList = aiListList;
    }
    
}
