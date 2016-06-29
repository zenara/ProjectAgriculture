/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lms.project.dto;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "book", catalog = "lms", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BookDTO.findAll", query = "SELECT b FROM BookDTO b"),
    @NamedQuery(name = "BookDTO.findByBookId", query = "SELECT b FROM BookDTO b WHERE b.bookId = :bookId"),
    @NamedQuery(name = "BookDTO.findByBookName", query = "SELECT b FROM BookDTO b WHERE b.bookName = :bookName"),
    @NamedQuery(name = "BookDTO.findByAuthor", query = "SELECT b FROM BookDTO b WHERE b.author = :author"),
    @NamedQuery(name = "BookDTO.findByPage", query = "SELECT b FROM BookDTO b WHERE b.page = :page"),
    @NamedQuery(name = "BookDTO.findByPrice", query = "SELECT b FROM BookDTO b WHERE b.price = :price"),
    @NamedQuery(name = "BookDTO.findByLocation", query = "SELECT b FROM BookDTO b WHERE b.location = :location"),
    @NamedQuery(name = "BookDTO.findByDescription", query = "SELECT b FROM BookDTO b WHERE b.description = :description")})
public class BookDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(nullable = false, length = 10)
    private String bookId;
    @Size(max = 100)
    @Column(length = 100)
    private String bookName;
    @Size(max = 100)
    @Column(length = 100)
    private String author;
    private Integer page;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(precision = 10, scale = 2)
    private BigDecimal price;
    @Size(max = 100)
    @Column(length = 100)
    private String location;
    @Size(max = 300)
    @Column(length = 300)
    private String description;
    @JoinColumn(name = "catId", referencedColumnName = "catId")
    @ManyToOne(fetch = FetchType.LAZY)
    private CategoryDTO catId;
    @OneToMany(mappedBy = "bookId", fetch = FetchType.LAZY)
    private List<BookdetailDTO> bookdetailDTOList;

    public BookDTO() {
    }

    public BookDTO(String bookId) {
        this.bookId = bookId;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CategoryDTO getCatId() {
        return catId;
    }

    public void setCatId(CategoryDTO catId) {
        this.catId = catId;
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
        hash += (bookId != null ? bookId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BookDTO)) {
            return false;
        }
        BookDTO other = (BookDTO) object;
        if ((this.bookId == null && other.bookId != null) || (this.bookId != null && !this.bookId.equals(other.bookId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.lms.project.dto.BookDTO[ bookId=" + bookId + " ]";
    }
    
}
