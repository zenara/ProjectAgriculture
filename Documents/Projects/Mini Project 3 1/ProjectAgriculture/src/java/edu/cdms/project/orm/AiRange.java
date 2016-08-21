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
@Table(name = "ai_range")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AiRange.findAll", query = "SELECT a FROM AiRange a"),
    @NamedQuery(name = "AiRange.findByRangeId", query = "SELECT a FROM AiRange a WHERE a.rangeId = :rangeId"),
    @NamedQuery(name = "AiRange.findByRangeName", query = "SELECT a FROM AiRange a WHERE a.rangeName = :rangeName")})
public class AiRange implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "rangeId")
    private String rangeId;
    @Size(max = 50)
    @Column(name = "rangeName")
    private String rangeName;
    @OneToMany(mappedBy = "rangeId", fetch = FetchType.LAZY)
    private List<AiList> aiListList;
    @JoinColumn(name = "ascId", referencedColumnName = "ascId")
    @ManyToOne(fetch = FetchType.LAZY)
    private Ascenter ascId;

    public AiRange() {
    }

    public AiRange(String rangeId) {
        this.rangeId = rangeId;
    }

    public String getRangeId() {
        return rangeId;
    }

    public void setRangeId(String rangeId) {
        this.rangeId = rangeId;
    }

    public String getRangeName() {
        return rangeName;
    }

    public void setRangeName(String rangeName) {
        this.rangeName = rangeName;
    }

    @XmlTransient
    public List<AiList> getAiListList() {
        return aiListList;
    }

    public void setAiListList(List<AiList> aiListList) {
        this.aiListList = aiListList;
    }

    public Ascenter getAscId() {
        return ascId;
    }

    public void setAscId(Ascenter ascId) {
        this.ascId = ascId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rangeId != null ? rangeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AiRange)) {
            return false;
        }
        AiRange other = (AiRange) object;
        if ((this.rangeId == null && other.rangeId != null) || (this.rangeId != null && !this.rangeId.equals(other.rangeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.cdms.project.orm.AiRange[ rangeId=" + rangeId + " ]";
    }
    
}
