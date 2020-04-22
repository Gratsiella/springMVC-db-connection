package com.grats.assignment02.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "trainers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trainers.findAll", query = "SELECT t FROM Trainers t"),
    @NamedQuery(name = "Trainers.findByTrnId", query = "SELECT t FROM Trainers t WHERE t.trnId = :trnId"),
    @NamedQuery(name = "Trainers.findByTrnFirstname", query = "SELECT t FROM Trainers t WHERE t.trnFirstname = :trnFirstname"),
    @NamedQuery(name = "Trainers.findByTrnLastname", query = "SELECT t FROM Trainers t WHERE t.trnLastname = :trnLastname"),
    @NamedQuery(name = "Trainers.findByTrnSubject", query = "SELECT t FROM Trainers t WHERE t.trnSubject = :trnSubject")})
public class Trainers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "trn_id")
    private Integer trnId;
    @Basic(optional = false)
    @NotNull
    @NotBlank(message = "Name is mandatory")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Only alphabetical characters, no numbers")
    @Size(min = 3, max = 45, message = "Name must have 3 - 45 characters.")
    @Column(name = "trn_firstname")
    private String trnFirstname;
    @Basic(optional = false)
    @NotNull
    @NotBlank(message = "Surname is mandatory")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Only alphabetical characters, no numbers")
    @Size(min = 3, max = 45, message = "Surname must have 3 - 45 characters.")
    @Column(name = "trn_lastname")
    private String trnLastname;
    @Size(max = 45)
    @Column(name = "trn_subject")
    private String trnSubject;

    public Trainers() {
    }

    public Trainers(Integer trnId) {
        this.trnId = trnId;
    }

    public Trainers(Integer trnId, String trnFirstname, String trnLastname) {
        this.trnId = trnId;
        this.trnFirstname = trnFirstname;
        this.trnLastname = trnLastname;
    }

    public Integer getTrnId() {
        return trnId;
    }

    public void setTrnId(Integer trnId) {
        this.trnId = trnId;
    }

    public String getTrnFirstname() {
        return trnFirstname;
    }

    public void setTrnFirstname(String trnFirstname) {
        this.trnFirstname = trnFirstname;
    }

    public String getTrnLastname() {
        return trnLastname;
    }

    public void setTrnLastname(String trnLastname) {
        this.trnLastname = trnLastname;
    }

    public String getTrnSubject() {
        return trnSubject;
    }

    public void setTrnSubject(String trnSubject) {
        this.trnSubject = trnSubject;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trnId != null ? trnId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trainers)) {
            return false;
        }
        Trainers other = (Trainers) object;
        if ((this.trnId == null && other.trnId != null) || (this.trnId != null && !this.trnId.equals(other.trnId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.grats.assignment02.entities.Trainers[ trnId=" + trnId + " ]";
    }

}
