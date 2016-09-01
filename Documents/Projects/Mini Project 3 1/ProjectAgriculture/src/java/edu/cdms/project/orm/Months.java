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
@Table(name = "months")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Months.findAll", query = "SELECT m FROM Months m"),
    @NamedQuery(name = "Months.findByMonthId", query = "SELECT m FROM Months m WHERE m.monthId = :monthId"),
    @NamedQuery(name = "Months.findByMonthName", query = "SELECT m FROM Months m WHERE m.monthName = :monthName")})
public class Months implements Serializable {
    @OneToMany(mappedBy = "monthId", fetch = FetchType.LAZY)
    private List<Rainfedpaddy> rainfedpaddyList;
    @OneToMany(mappedBy = "monthId", fetch = FetchType.LAZY)
    private List<Minorpaddy> minorpaddyList;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "monthId")
    private Integer monthId;
    @Size(max = 20)
    @Column(name = "monthName")
    private String monthName;
    @JoinColumn(name = "seasonId", referencedColumnName = "seasonId")
    @ManyToOne(fetch = FetchType.LAZY)
    private Seasons seasonId;
    @OneToMany(mappedBy = "monthId", fetch = FetchType.LAZY)
    private List<Majorpaddy> majorpaddyList;

    public Months() {
    }

    public Months(Integer monthId) {
        this.monthId = monthId;
    }

    public Integer getMonthId() {
        return monthId;
    }

    public void setMonthId(Integer monthId) {
        this.monthId = monthId;
    }

    public String getMonthName() {
        return monthName;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }

    public Seasons getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(Seasons seasonId) {
        this.seasonId = seasonId;
    }

    @XmlTransient
    public List<Majorpaddy> getMajorpaddyList() {
        return majorpaddyList;
    }

    public void setMajorpaddyList(List<Majorpaddy> majorpaddyList) {
        this.majorpaddyList = majorpaddyList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (monthId != null ? monthId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Months)) {
            return false;
        }
        Months other = (Months) object;
        if ((this.monthId == null && other.monthId != null) || (this.monthId != null && !this.monthId.equals(other.monthId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.cdms.project.orm.Months[ monthId=" + monthId + " ]";
    }

    @XmlTransient
    public List<Rainfedpaddy> getRainfedpaddyList() {
        return rainfedpaddyList;
    }

    public void setRainfedpaddyList(List<Rainfedpaddy> rainfedpaddyList) {
        this.rainfedpaddyList = rainfedpaddyList;
    }

    @XmlTransient
    public List<Minorpaddy> getMinorpaddyList() {
        return minorpaddyList;
    }

    public void setMinorpaddyList(List<Minorpaddy> minorpaddyList) {
        this.minorpaddyList = minorpaddyList;
    }
    
}
