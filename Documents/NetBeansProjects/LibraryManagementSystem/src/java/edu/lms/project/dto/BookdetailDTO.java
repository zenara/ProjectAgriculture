/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lms.project.dto;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Chathurika Senani
 */
@Entity
@Table(name = "bookdetail", catalog = "lms", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BookdetailDTO.findAll", query = "SELECT b FROM BookdetailDTO b"),
    @NamedQuery(name = "BookdetailDTO.findByBookDetailId", query = "SELECT b FROM BookdetailDTO b WHERE b.bookDetailId = :bookDetailId"),
    @NamedQuery(name = "BookdetailDTO.findByIssueDate", query = "SELECT b FROM BookdetailDTO b WHERE b.issueDate = :issueDate"),
    @NamedQuery(name = "BookdetailDTO.findByIssueTime", query = "SELECT b FROM BookdetailDTO b WHERE b.issueTime = :issueTime"),
    @NamedQuery(name = "BookdetailDTO.findByNote", query = "SELECT b FROM BookdetailDTO b WHERE b.note = :note")})
public class BookdetailDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer bookDetailId;
    @Temporal(TemporalType.DATE)
    private Date issueDate;
    @Size(max = 100)
    @Column(length = 100)
    private String issueTime;
    @Size(max = 100)
    @Column(length = 100)
    private String note;
    @JoinColumn(name = "bookId", referencedColumnName = "bookId")
    @ManyToOne(fetch = FetchType.LAZY)
    private BookDTO bookId;
    @JoinColumn(name = "memberId", referencedColumnName = "memberId")
    @ManyToOne(fetch = FetchType.LAZY)
    private MemberDTO memberId;

    public BookdetailDTO() {
    }

    public BookdetailDTO(Integer bookDetailId) {
        this.bookDetailId = bookDetailId;
    }

    public Integer getBookDetailId() {
        return bookDetailId;
    }

    public void setBookDetailId(Integer bookDetailId) {
        this.bookDetailId = bookDetailId;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public String getIssueTime() {
        return issueTime;
    }

    public void setIssueTime(String issueTime) {
        this.issueTime = issueTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public BookDTO getBookId() {
        return bookId;
    }

    public void setBookId(BookDTO bookId) {
        this.bookId = bookId;
    }

    public MemberDTO getMemberId() {
        return memberId;
    }

    public void setMemberId(MemberDTO memberId) {
        this.memberId = memberId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bookDetailId != null ? bookDetailId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BookdetailDTO)) {
            return false;
        }
        BookdetailDTO other = (BookdetailDTO) object;
        if ((this.bookDetailId == null && other.bookDetailId != null) || (this.bookDetailId != null && !this.bookDetailId.equals(other.bookDetailId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.lms.project.dto.BookdetailDTO[ bookDetailId=" + bookDetailId + " ]";
    }
    
}
