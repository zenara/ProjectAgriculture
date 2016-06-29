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
@Table(name = "category", catalog = "lms", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CategoryDTO.findAll", query = "SELECT c FROM CategoryDTO c"),
    @NamedQuery(name = "CategoryDTO.findByCatId", query = "SELECT c FROM CategoryDTO c WHERE c.catId = :catId"),
    @NamedQuery(name = "CategoryDTO.findByCatName", query = "SELECT c FROM CategoryDTO c WHERE c.catName = :catName")})
public class CategoryDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(nullable = false, length = 10)
    private String catId;
    @Size(max = 50)
    @Column(length = 50)
    private String catName;
    @OneToMany(mappedBy = "catId", fetch = FetchType.LAZY)
    private List<BookDTO> bookDTOList;

    public CategoryDTO() {
    }

    public CategoryDTO(String catId) {
        this.catId = catId;
    }

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    @XmlTransient
    public List<BookDTO> getBookDTOList() {
        return bookDTOList;
    }

    public void setBookDTOList(List<BookDTO> bookDTOList) {
        this.bookDTOList = bookDTOList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (catId != null ? catId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategoryDTO)) {
            return false;
        }
        CategoryDTO other = (CategoryDTO) object;
        if ((this.catId == null && other.catId != null) || (this.catId != null && !this.catId.equals(other.catId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.lms.project.dto.CategoryDTO[ catId=" + catId + " ]";
    }
    
}
