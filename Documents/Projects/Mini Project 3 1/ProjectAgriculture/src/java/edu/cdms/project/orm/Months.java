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
    @NamedQuery(name = "Months.findByMonthid", query = "SELECT m FROM Months m WHERE m.monthid = :monthid"),
    @NamedQuery(name = "Months.findByMonthname", query = "SELECT m FROM Months m WHERE m.monthname = :monthname")})
public class Months implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "monthid")
    private Integer monthid;
    @Size(max = 20)
    @Column(name = "monthname")
    private String monthname;
    @JoinColumn(name = "seasonid", referencedColumnName = "seasonid")
    @ManyToOne(fetch = FetchType.LAZY)
    private Seasons seasonid;
    @OneToMany(mappedBy = "monthid", fetch = FetchType.LAZY)
    private List<Rainfedpaddy> rainfedpaddyList;
    @OneToMany(mappedBy = "monthid", fetch = FetchType.LAZY)
    private List<Majorpaddy> majorpaddyList;
    @OneToMany(mappedBy = "monthid", fetch = FetchType.LAZY)
    private List<Minorpaddy> minorpaddyList;

    public Months() {
    }

    public Months(Integer monthid) {
        this.monthid = monthid;
    }

    public Integer getMonthid() {
        return monthid;
    }

    public void setMonthid(Integer monthid) {
        this.monthid = monthid;
    }

    public String getMonthname() {
        return monthname;
    }

    public void setMonthname(String monthname) {
        this.monthname = monthname;
    }

    public Seasons getSeasonid() {
        return seasonid;
    }

    public void setSeasonid(Seasons seasonid) {
        this.seasonid = seasonid;
    }

    @XmlTransient
    public List<Rainfedpaddy> getRainfedpaddyList() {
        return rainfedpaddyList;
    }

    public void setRainfedpaddyList(List<Rainfedpaddy> rainfedpaddyList) {
        this.rainfedpaddyList = rainfedpaddyList;
    }

    @XmlTransient
    public List<Majorpaddy> getMajorpaddyList() {
        return majorpaddyList;
    }

    public void setMajorpaddyList(List<Majorpaddy> majorpaddyList) {
        this.majorpaddyList = majorpaddyList;
    }

    @XmlTransient
    public List<Minorpaddy> getMinorpaddyList() {
        return minorpaddyList;
    }

    public void setMinorpaddyList(List<Minorpaddy> minorpaddyList) {
        this.minorpaddyList = minorpaddyList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (monthid != null ? monthid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Months)) {
            return false;
        }
        Months other = (Months) object;
        if ((this.monthid == null && other.monthid != null) || (this.monthid != null && !this.monthid.equals(other.monthid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.cdms.project.orm.Months[ monthid=" + monthid + " ]";
    }
    
}
