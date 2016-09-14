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
@Table(name = "adazone")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Adazone.findAll", query = "SELECT a FROM Adazone a"),
    @NamedQuery(name = "Adazone.findByAdaid", query = "SELECT a FROM Adazone a WHERE a.adaid = :adaid"),
    @NamedQuery(name = "Adazone.findByAdaname", query = "SELECT a FROM Adazone a WHERE a.adaname = :adaname")})
public class Adazone implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "adaid")
    private Integer adaid;
    @Size(max = 50)
    @Column(name = "adaname")
    private String adaname;
    @OneToMany(mappedBy = "adaid", fetch = FetchType.LAZY)
    private List<Ailist> ailistList;
    @OneToMany(mappedBy = "adaid", fetch = FetchType.LAZY)
    private List<District> districtList;

    public Adazone() {
    }

    public Adazone(Integer adaid) {
        this.adaid = adaid;
    }

    public Integer getAdaid() {
        return adaid;
    }

    public void setAdaid(Integer adaid) {
        this.adaid = adaid;
    }

    public String getAdaname() {
        return adaname;
    }

    public void setAdaname(String adaname) {
        this.adaname = adaname;
    }

    @XmlTransient
    public List<Ailist> getAilistList() {
        return ailistList;
    }

    public void setAilistList(List<Ailist> ailistList) {
        this.ailistList = ailistList;
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
        hash += (adaid != null ? adaid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Adazone)) {
            return false;
        }
        Adazone other = (Adazone) object;
        if ((this.adaid == null && other.adaid != null) || (this.adaid != null && !this.adaid.equals(other.adaid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.cdms.project.orm.Adazone[ adaid=" + adaid + " ]";
    }
    
}
