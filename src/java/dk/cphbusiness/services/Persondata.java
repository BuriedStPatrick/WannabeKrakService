/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.cphbusiness.services;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "PERSONDATA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Persondata.findAll", query = "SELECT p FROM Persondata p"),
    @NamedQuery(name = "Persondata.findById", query = "SELECT p FROM Persondata p WHERE p.id = :id"),
    @NamedQuery(name = "Persondata.findByFirstName", query = "SELECT p FROM Persondata p WHERE p.firstName = :firstName"),
    @NamedQuery(name = "Persondata.findByLastName", query = "SELECT p FROM Persondata p WHERE p.lastName = :lastName"),
    @NamedQuery(name = "Persondata.findByStreet", query = "SELECT p FROM Persondata p WHERE p.street = :street"),
    @NamedQuery(name = "Persondata.findByCity", query = "SELECT p FROM Persondata p WHERE p.city = :city"),
    @NamedQuery(name = "Persondata.findByZipcode", query = "SELECT p FROM Persondata p WHERE p.zipcode = :zipcode"),
    @NamedQuery(name = "Persondata.findByPhone", query = "SELECT p FROM Persondata p WHERE p.phone = :phone")})
public class Persondata implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 20)
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Size(max = 30)
    @Column(name = "LAST_NAME")
    private String lastName;
    @Size(max = 50)
    @Column(name = "STREET")
    private String street;
    @Size(max = 20)
    @Column(name = "CITY")
    private String city;
    @Size(max = 4)
    @Column(name = "ZIPCODE")
    private String zipcode;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 10)
    @Column(name = "PHONE")
    private String phone;

    public Persondata() {
    }

    public Persondata(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
        if (!(object instanceof Persondata)) {
            return false;
        }
        Persondata other = (Persondata) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dk.cphbusiness.services.Persondata[ id=" + id + " ]";
    }
    
}
