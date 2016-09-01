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
@Table(name = "seasons")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Seasons.findAll", query = "SELECT s FROM Seasons s"),
    @NamedQuery(name = "Seasons.findBySeasonId", query = "SELECT s FROM Seasons s WHERE s.seasonId = :seasonId"),
    @NamedQuery(name = "Seasons.findBySeasonName", query = "SELECT s FROM Seasons s WHERE s.seasonName = :seasonName")})
public class Seasons implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "seasonId")
    private Integer seasonId;
    @Size(max = 20)
    @Column(name = "seasonName")
    private String seasonName;
    @OneToMany(mappedBy = "seasonId", fetch = FetchType.LAZY)
    private List<Months> monthsList;

    public Seasons() {
    }

    public Seasons(Integer seasonId) {
        this.seasonId = seasonId;
    }

    public Integer getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(Integer seasonId) {
        this.seasonId = seasonId;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public void setSeasonName(String seasonName) {
        this.seasonName = seasonName;
    }

    @XmlTransient
    public List<Months> getMonthsList() {
        return monthsList;
    }

    public void setMonthsList(List<Months> monthsList) {
        this.monthsList = monthsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (seasonId != null ? seasonId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Seasons)) {
            return false;
        }
        Seasons other = (Seasons) object;
        if ((this.seasonId == null && other.seasonId != null) || (this.seasonId != null && !this.seasonId.equals(other.seasonId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.cdms.project.orm.Seasons[ seasonId=" + seasonId + " ]";
    }
    
}
