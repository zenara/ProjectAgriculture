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
@Table(name = "ascenter")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ascenter.findAll", query = "SELECT a FROM Ascenter a"),
    @NamedQuery(name = "Ascenter.findByAscid", query = "SELECT a FROM Ascenter a WHERE a.ascid = :ascid"),
    @NamedQuery(name = "Ascenter.findByAscname", query = "SELECT a FROM Ascenter a WHERE a.ascname = :ascname")})
public class Ascenter implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ascid")
    private Integer ascid;
    @Size(max = 50)
    @Column(name = "ascname")
    private String ascname;
    @OneToMany(mappedBy = "ascid", fetch = FetchType.LAZY)
    private List<Ailist> ailistList;
    @JoinColumn(name = "dsid", referencedColumnName = "dsid")
    @ManyToOne(fetch = FetchType.LAZY)
    private Ds dsid;

    public Ascenter() {
    }

    public Ascenter(Integer ascid) {
        this.ascid = ascid;
    }

    public Integer getAscid() {
        return ascid;
    }

    public void setAscid(Integer ascid) {
        this.ascid = ascid;
    }

    public String getAscname() {
        return ascname;
    }

    public void setAscname(String ascname) {
        this.ascname = ascname;
    }

    @XmlTransient
    public List<Ailist> getAilistList() {
        return ailistList;
    }

    public void setAilistList(List<Ailist> ailistList) {
        this.ailistList = ailistList;
    }

    public Ds getDsid() {
        return dsid;
    }

    public void setDsid(Ds dsid) {
        this.dsid = dsid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ascid != null ? ascid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ascenter)) {
            return false;
        }
        Ascenter other = (Ascenter) object;
        if ((this.ascid == null && other.ascid != null) || (this.ascid != null && !this.ascid.equals(other.ascid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.cdms.project.orm.Ascenter[ ascid=" + ascid + " ]";
    }
    
}
