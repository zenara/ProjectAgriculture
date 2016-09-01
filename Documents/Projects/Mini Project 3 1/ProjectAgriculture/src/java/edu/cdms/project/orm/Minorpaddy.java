/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cdms.project.orm;

import java.io.Serializable;
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
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Chathurika Senani
 */
@Entity
@Table(name = "minorpaddy")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Minorpaddy.findAll", query = "SELECT m FROM Minorpaddy m"),
    @NamedQuery(name = "Minorpaddy.findById", query = "SELECT m FROM Minorpaddy m WHERE m.id = :id"),
    @NamedQuery(name = "Minorpaddy.findByMonthlyProgress", query = "SELECT m FROM Minorpaddy m WHERE m.monthlyProgress = :monthlyProgress")})
public class Minorpaddy implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "monthlyProgress")
    private Float monthlyProgress;
    @JoinColumn(name = "yearId", referencedColumnName = "yearId")
    @ManyToOne(fetch = FetchType.LAZY)
    private Years yearId;
    @JoinColumn(name = "monthId", referencedColumnName = "monthId")
    @ManyToOne(fetch = FetchType.LAZY)
    private Months monthId;
    @JoinColumn(name = "varietyId", referencedColumnName = "varietyId")
    @ManyToOne(fetch = FetchType.LAZY)
    private Variety varietyId;

    public Minorpaddy() {
    }

    public Minorpaddy(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getMonthlyProgress() {
        return monthlyProgress;
    }

    public void setMonthlyProgress(Float monthlyProgress) {
        this.monthlyProgress = monthlyProgress;
    }

    public Years getYearId() {
        return yearId;
    }

    public void setYearId(Years yearId) {
        this.yearId = yearId;
    }

    public Months getMonthId() {
        return monthId;
    }

    public void setMonthId(Months monthId) {
        this.monthId = monthId;
    }

    public Variety getVarietyId() {
        return varietyId;
    }

    public void setVarietyId(Variety varietyId) {
        this.varietyId = varietyId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Minorpaddy)) {
            return false;
        }
        Minorpaddy other = (Minorpaddy) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.cdms.project.orm.Minorpaddy[ id=" + id + " ]";
    }
    
}
