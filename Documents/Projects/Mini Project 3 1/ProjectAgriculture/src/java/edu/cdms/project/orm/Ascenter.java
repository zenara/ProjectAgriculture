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
@Table(name = "ascenter")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ascenter.findAll", query = "SELECT a FROM Ascenter a"),
    @NamedQuery(name = "Ascenter.findByAscId", query = "SELECT a FROM Ascenter a WHERE a.ascId = :ascId"),
    @NamedQuery(name = "Ascenter.findByAscName", query = "SELECT a FROM Ascenter a WHERE a.ascName = :ascName")})
public class Ascenter implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ascId")
    private String ascId;
    @Size(max = 50)
    @Column(name = "ascName")
    private String ascName;
    @OneToMany(mappedBy = "ascId", fetch = FetchType.LAZY)
    private List<AiList> aiListList;
    @OneToMany(mappedBy = "ascId", fetch = FetchType.LAZY)
    private List<AiRange> aiRangeList;
    @JoinColumn(name = "districtId", referencedColumnName = "districtId")
    @ManyToOne(fetch = FetchType.LAZY)
    private District districtId;
    @JoinColumn(name = "dsId", referencedColumnName = "dsId")
    @ManyToOne(fetch = FetchType.LAZY)
    private Ds dsId;

    public Ascenter() {
    }

    public Ascenter(String ascId) {
        this.ascId = ascId;
    }

    public String getAscId() {
        return ascId;
    }

    public void setAscId(String ascId) {
        this.ascId = ascId;
    }

    public String getAscName() {
        return ascName;
    }

    public void setAscName(String ascName) {
        this.ascName = ascName;
    }

    @XmlTransient
    public List<AiList> getAiListList() {
        return aiListList;
    }

    public void setAiListList(List<AiList> aiListList) {
        this.aiListList = aiListList;
    }

    @XmlTransient
    public List<AiRange> getAiRangeList() {
        return aiRangeList;
    }

    public void setAiRangeList(List<AiRange> aiRangeList) {
        this.aiRangeList = aiRangeList;
    }

    public District getDistrictId() {
        return districtId;
    }

    public void setDistrictId(District districtId) {
        this.districtId = districtId;
    }

    public Ds getDsId() {
        return dsId;
    }

    public void setDsId(Ds dsId) {
        this.dsId = dsId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ascId != null ? ascId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ascenter)) {
            return false;
        }
        Ascenter other = (Ascenter) object;
        if ((this.ascId == null && other.ascId != null) || (this.ascId != null && !this.ascId.equals(other.ascId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.cdms.project.orm.Ascenter[ ascId=" + ascId + " ]";
    }
    
}
