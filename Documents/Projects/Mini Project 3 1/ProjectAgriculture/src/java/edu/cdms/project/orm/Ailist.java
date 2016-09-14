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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Chathurika Senani
 */
@Entity
@Table(name = "ailist")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ailist.findAll", query = "SELECT a FROM Ailist a"),
    @NamedQuery(name = "Ailist.findByAiid", query = "SELECT a FROM Ailist a WHERE a.aiid = :aiid"),
    @NamedQuery(name = "Ailist.findByAirange", query = "SELECT a FROM Ailist a WHERE a.airange = :airange"),
    @NamedQuery(name = "Ailist.findByAiname", query = "SELECT a FROM Ailist a WHERE a.ainame = :ainame"),
    @NamedQuery(name = "Ailist.findByNic", query = "SELECT a FROM Ailist a WHERE a.nic = :nic"),
    @NamedQuery(name = "Ailist.findByTelephoneno", query = "SELECT a FROM Ailist a WHERE a.telephoneno = :telephoneno"),
    @NamedQuery(name = "Ailist.findByEmail", query = "SELECT a FROM Ailist a WHERE a.email = :email")})
public class Ailist implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "aiid")
    private int aiid;
    @Size(max = 50)
    @Column(name = "airange")
    private String airange;
    @Size(max = 100)
    @Column(name = "ainame")
    private String ainame;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "nic")
    private String nic;
    @Size(max = 20)
    @Column(name = "telephoneno")
    private String telephoneno;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 50)
    @Column(name = "email")
    private String email;
    @JoinColumn(name = "adaid", referencedColumnName = "adaid")
    @ManyToOne(fetch = FetchType.LAZY)
    private Adazone adaid;
    @JoinColumn(name = "districtid", referencedColumnName = "districtid")
    @ManyToOne(fetch = FetchType.LAZY)
    private District districtid;
    @JoinColumn(name = "dsid", referencedColumnName = "dsid")
    @ManyToOne(fetch = FetchType.LAZY)
    private Ds dsid;
    @JoinColumn(name = "ascid", referencedColumnName = "ascid")
    @ManyToOne(fetch = FetchType.LAZY)
    private Ascenter ascid;

    public Ailist() {
    }

    public Ailist(String nic) {
        this.nic = nic;
    }

    public Ailist(String nic, int aiid) {
        this.nic = nic;
        this.aiid = aiid;
    }

    public int getAiid() {
        return aiid;
    }

    public void setAiid(int aiid) {
        this.aiid = aiid;
    }

    public String getAirange() {
        return airange;
    }

    public void setAirange(String airange) {
        this.airange = airange;
    }

    public String getAiname() {
        return ainame;
    }

    public void setAiname(String ainame) {
        this.ainame = ainame;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getTelephoneno() {
        return telephoneno;
    }

    public void setTelephoneno(String telephoneno) {
        this.telephoneno = telephoneno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Adazone getAdaid() {
        return adaid;
    }

    public void setAdaid(Adazone adaid) {
        this.adaid = adaid;
    }

    public District getDistrictid() {
        return districtid;
    }

    public void setDistrictid(District districtid) {
        this.districtid = districtid;
    }

    public Ds getDsid() {
        return dsid;
    }

    public void setDsid(Ds dsid) {
        this.dsid = dsid;
    }

    public Ascenter getAscid() {
        return ascid;
    }

    public void setAscid(Ascenter ascid) {
        this.ascid = ascid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nic != null ? nic.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ailist)) {
            return false;
        }
        Ailist other = (Ailist) object;
        if ((this.nic == null && other.nic != null) || (this.nic != null && !this.nic.equals(other.nic))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.cdms.project.orm.Ailist[ nic=" + nic + " ]";
    }
    
}
