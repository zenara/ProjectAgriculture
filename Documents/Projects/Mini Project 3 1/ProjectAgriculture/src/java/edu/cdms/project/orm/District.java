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
@Table(name = "district")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "District.findAll", query = "SELECT d FROM District d"),
    @NamedQuery(name = "District.findByDistrictid", query = "SELECT d FROM District d WHERE d.districtid = :districtid"),
    @NamedQuery(name = "District.findByDistrictname", query = "SELECT d FROM District d WHERE d.districtname = :districtname")})
public class District implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "districtid")
    private Integer districtid;
    @Size(max = 50)
    @Column(name = "districtname")
    private String districtname;
    @OneToMany(mappedBy = "districtid", fetch = FetchType.LAZY)
    private List<Ailist> ailistList;
    @OneToMany(mappedBy = "districtid", fetch = FetchType.LAZY)
    private List<Ds> dsList;
    @JoinColumn(name = "adaid", referencedColumnName = "adaid")
    @ManyToOne(fetch = FetchType.LAZY)
    private Adazone adaid;

    public District() {
    }

    public District(Integer districtid) {
        this.districtid = districtid;
    }

    public Integer getDistrictid() {
        return districtid;
    }

    public void setDistrictid(Integer districtid) {
        this.districtid = districtid;
    }

    public String getDistrictname() {
        return districtname;
    }

    public void setDistrictname(String districtname) {
        this.districtname = districtname;
    }

    @XmlTransient
    public List<Ailist> getAilistList() {
        return ailistList;
    }

    public void setAilistList(List<Ailist> ailistList) {
        this.ailistList = ailistList;
    }

    @XmlTransient
    public List<Ds> getDsList() {
        return dsList;
    }

    public void setDsList(List<Ds> dsList) {
        this.dsList = dsList;
    }

    public Adazone getAdaid() {
        return adaid;
    }

    public void setAdaid(Adazone adaid) {
        this.adaid = adaid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (districtid != null ? districtid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof District)) {
            return false;
        }
        District other = (District) object;
        if ((this.districtid == null && other.districtid != null) || (this.districtid != null && !this.districtid.equals(other.districtid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.cdms.project.orm.District[ districtid=" + districtid + " ]";
    }
    
}
