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
    @NamedQuery(name = "Seasons.findBySeasonid", query = "SELECT s FROM Seasons s WHERE s.seasonid = :seasonid"),
    @NamedQuery(name = "Seasons.findBySeasonname", query = "SELECT s FROM Seasons s WHERE s.seasonname = :seasonname")})
public class Seasons implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "seasonid")
    private Integer seasonid;
    @Size(max = 20)
    @Column(name = "seasonname")
    private String seasonname;
    @OneToMany(mappedBy = "seasonid", fetch = FetchType.LAZY)
    private List<Months> monthsList;

    public Seasons() {
    }

    public Seasons(Integer seasonid) {
        this.seasonid = seasonid;
    }

    public Integer getSeasonid() {
        return seasonid;
    }

    public void setSeasonid(Integer seasonid) {
        this.seasonid = seasonid;
    }

    public String getSeasonname() {
        return seasonname;
    }

    public void setSeasonname(String seasonname) {
        this.seasonname = seasonname;
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
        hash += (seasonid != null ? seasonid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Seasons)) {
            return false;
        }
        Seasons other = (Seasons) object;
        if ((this.seasonid == null && other.seasonid != null) || (this.seasonid != null && !this.seasonid.equals(other.seasonid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.cdms.project.orm.Seasons[ seasonid=" + seasonid + " ]";
    }
    
}
