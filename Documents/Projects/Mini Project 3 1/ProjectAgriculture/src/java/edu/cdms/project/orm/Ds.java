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
@Table(name = "ds")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ds.findAll", query = "SELECT d FROM Ds d"),
    @NamedQuery(name = "Ds.findByDsid", query = "SELECT d FROM Ds d WHERE d.dsid = :dsid"),
    @NamedQuery(name = "Ds.findByDsname", query = "SELECT d FROM Ds d WHERE d.dsname = :dsname")})
public class Ds implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "dsid")
    private Integer dsid;
    @Size(max = 50)
    @Column(name = "dsname")
    private String dsname;
    @OneToMany(mappedBy = "dsid", fetch = FetchType.LAZY)
    private List<Ailist> ailistList;
    @JoinColumn(name = "districtid", referencedColumnName = "districtid")
    @ManyToOne(fetch = FetchType.LAZY)
    private District districtid;
    @OneToMany(mappedBy = "dsid", fetch = FetchType.LAZY)
    private List<Ascenter> ascenterList;

    public Ds() {
    }

    public Ds(Integer dsid) {
        this.dsid = dsid;
    }

    public Integer getDsid() {
        return dsid;
    }

    public void setDsid(Integer dsid) {
        this.dsid = dsid;
    }

    public String getDsname() {
        return dsname;
    }

    public void setDsname(String dsname) {
        this.dsname = dsname;
    }

    @XmlTransient
    public List<Ailist> getAilistList() {
        return ailistList;
    }

    public void setAilistList(List<Ailist> ailistList) {
        this.ailistList = ailistList;
    }

    public District getDistrictid() {
        return districtid;
    }

    public void setDistrictid(District districtid) {
        this.districtid = districtid;
    }

    @XmlTransient
    public List<Ascenter> getAscenterList() {
        return ascenterList;
    }

    public void setAscenterList(List<Ascenter> ascenterList) {
        this.ascenterList = ascenterList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dsid != null ? dsid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ds)) {
            return false;
        }
        Ds other = (Ds) object;
        if ((this.dsid == null && other.dsid != null) || (this.dsid != null && !this.dsid.equals(other.dsid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.cdms.project.orm.Ds[ dsid=" + dsid + " ]";
    }
    
}
