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
@Table(name = "ai_list")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AiList.findAll", query = "SELECT a FROM AiList a"),
    @NamedQuery(name = "AiList.findByNum", query = "SELECT a FROM AiList a WHERE a.num = :num"),
    @NamedQuery(name = "AiList.findByADAZone", query = "SELECT a FROM AiList a WHERE a.aDAZone = :aDAZone"),
    @NamedQuery(name = "AiList.findByDistrict", query = "SELECT a FROM AiList a WHERE a.district = :district"),
    @NamedQuery(name = "AiList.findByDs", query = "SELECT a FROM AiList a WHERE a.ds = :ds"),
    @NamedQuery(name = "AiList.findByCenter", query = "SELECT a FROM AiList a WHERE a.center = :center"),
    @NamedQuery(name = "AiList.findByAIrange", query = "SELECT a FROM AiList a WHERE a.aIrange = :aIrange"),
    @NamedQuery(name = "AiList.findByAIname", query = "SELECT a FROM AiList a WHERE a.aIname = :aIname"),
    @NamedQuery(name = "AiList.findByNic", query = "SELECT a FROM AiList a WHERE a.nic = :nic"),
    @NamedQuery(name = "AiList.findByTelephoneno", query = "SELECT a FROM AiList a WHERE a.telephoneno = :telephoneno"),
    @NamedQuery(name = "AiList.findByEmail", query = "SELECT a FROM AiList a WHERE a.email = :email")})
public class AiList implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "Num")
    private int num;
    @Size(max = 50)
    @Column(name = "ADA_Zone")
    private String aDAZone;
    @Size(max = 50)
    @Column(name = "DISTRICT")
    private String district;
    @Size(max = 50)
    @Column(name = "DS")
    private String ds;
    @Size(max = 50)
    @Column(name = "CENTER")
    private String center;
    @Size(max = 50)
    @Column(name = "AI_range")
    private String aIrange;
    @Size(max = 100)
    @Column(name = "AI_name")
    private String aIname;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "NIC")
    private String nic;
    @Size(max = 20)
    @Column(name = "Telephone_no")
    private String telephoneno;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 50)
    @Column(name = "EMAIL")
    private String email;
    @JoinColumn(name = "adaId", referencedColumnName = "adaId")
    @ManyToOne(fetch = FetchType.LAZY)
    private AdaZone adaId;
    @JoinColumn(name = "districtId", referencedColumnName = "districtId")
    @ManyToOne(fetch = FetchType.LAZY)
    private District districtId;
    @JoinColumn(name = "dsId", referencedColumnName = "dsId")
    @ManyToOne(fetch = FetchType.LAZY)
    private Ds dsId;
    @JoinColumn(name = "ascId", referencedColumnName = "ascId")
    @ManyToOne(fetch = FetchType.LAZY)
    private Ascenter ascId;
    @JoinColumn(name = "rangeId", referencedColumnName = "rangeId")
    @ManyToOne(fetch = FetchType.LAZY)
    private AiRange rangeId;

    public AiList() {
    }

    public AiList(String nic) {
        this.nic = nic;
    }

    public AiList(String nic, int num) {
        this.nic = nic;
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getADAZone() {
        return aDAZone;
    }

    public void setADAZone(String aDAZone) {
        this.aDAZone = aDAZone;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getDs() {
        return ds;
    }

    public void setDs(String ds) {
        this.ds = ds;
    }

    public String getCenter() {
        return center;
    }

    public void setCenter(String center) {
        this.center = center;
    }

    public String getAIrange() {
        return aIrange;
    }

    public void setAIrange(String aIrange) {
        this.aIrange = aIrange;
    }

    public String getAIname() {
        return aIname;
    }

    public void setAIname(String aIname) {
        this.aIname = aIname;
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

    public AdaZone getAdaId() {
        return adaId;
    }

    public void setAdaId(AdaZone adaId) {
        this.adaId = adaId;
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

    public Ascenter getAscId() {
        return ascId;
    }

    public void setAscId(Ascenter ascId) {
        this.ascId = ascId;
    }

    public AiRange getRangeId() {
        return rangeId;
    }

    public void setRangeId(AiRange rangeId) {
        this.rangeId = rangeId;
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
        if (!(object instanceof AiList)) {
            return false;
        }
        AiList other = (AiList) object;
        if ((this.nic == null && other.nic != null) || (this.nic != null && !this.nic.equals(other.nic))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.cdms.project.orm.AiList[ nic=" + nic + " ]";
    }
    
}
