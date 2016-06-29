/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lms.project.dto;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
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
@Table(name = "member", catalog = "lms", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MemberDTO.findAll", query = "SELECT m FROM MemberDTO m"),
    @NamedQuery(name = "MemberDTO.findByMemberId", query = "SELECT m FROM MemberDTO m WHERE m.memberId = :memberId"),
    @NamedQuery(name = "MemberDTO.findByMemberName", query = "SELECT m FROM MemberDTO m WHERE m.memberName = :memberName"),
    @NamedQuery(name = "MemberDTO.findByAddress", query = "SELECT m FROM MemberDTO m WHERE m.address = :address"),
    @NamedQuery(name = "MemberDTO.findByContact", query = "SELECT m FROM MemberDTO m WHERE m.contact = :contact"),
    @NamedQuery(name = "MemberDTO.findByNic", query = "SELECT m FROM MemberDTO m WHERE m.nic = :nic"),
    @NamedQuery(name = "MemberDTO.findByEmail", query = "SELECT m FROM MemberDTO m WHERE m.email = :email"),
    @NamedQuery(name = "MemberDTO.findByPassword", query = "SELECT m FROM MemberDTO m WHERE m.password = :password")})
public class MemberDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(nullable = false, length = 10)
    private String memberId;
    @Size(max = 100)
    @Column(length = 100)
    private String memberName;
    @Size(max = 100)
    @Column(length = 100)
    private String address;
    @Size(max = 100)
    @Column(length = 100)
    private String contact;
    @Size(max = 100)
    @Column(length = 100)
    private String nic;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 100)
    @Column(length = 100)
    private String email;
    @Size(max = 100)
    @Column(length = 100)
    private String password;
    @OneToMany(mappedBy = "memberId", fetch = FetchType.LAZY)
    private List<BookdetailDTO> bookdetailDTOList;

    public MemberDTO() {
    }

    public MemberDTO(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @XmlTransient
    public List<BookdetailDTO> getBookdetailDTOList() {
        return bookdetailDTOList;
    }

    public void setBookdetailDTOList(List<BookdetailDTO> bookdetailDTOList) {
        this.bookdetailDTOList = bookdetailDTOList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (memberId != null ? memberId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MemberDTO)) {
            return false;
        }
        MemberDTO other = (MemberDTO) object;
        if ((this.memberId == null && other.memberId != null) || (this.memberId != null && !this.memberId.equals(other.memberId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.lms.project.dto.MemberDTO[ memberId=" + memberId + " ]";
    }
    
}
