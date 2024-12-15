/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Acer
 */
@Entity
@Table(name = "place_order")
@NamedQueries({
    @NamedQuery(name = "PlaceOrder.findAll", query = "SELECT p FROM PlaceOrder p"),
    @NamedQuery(name = "PlaceOrder.findById", query = "SELECT p FROM PlaceOrder p WHERE p.id = :id"),
    @NamedQuery(name = "PlaceOrder.findByName", query = "SELECT p FROM PlaceOrder p WHERE p.name = :name"),
    @NamedQuery(name = "PlaceOrder.findByEmail", query = "SELECT p FROM PlaceOrder p WHERE p.email = :email"),
    @NamedQuery(name = "PlaceOrder.findByAddress", query = "SELECT p FROM PlaceOrder p WHERE p.address = :address"),
    @NamedQuery(name = "PlaceOrder.findByZipcode", query = "SELECT p FROM PlaceOrder p WHERE p.zipcode = :zipcode"),
    @NamedQuery(name = "PlaceOrder.findByPhone", query = "SELECT p FROM PlaceOrder p WHERE p.phone = :phone"),
    @NamedQuery(name = "PlaceOrder.findByTotal", query = "SELECT p FROM PlaceOrder p WHERE p.total = :total"),
    @NamedQuery(name = "PlaceOrder.findByOrderId", query = "SELECT p FROM PlaceOrder p WHERE p.orderId = :orderId")})
public class PlaceOrder implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 122)
    @Column(name = "name")
    private String name;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 122)
    @Column(name = "address")
    private String address;
    @Basic(optional = false)
    @NotNull
    @Column(name = "zipcode")
    private int zipcode;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "phone")
    private String phone;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total")
    private int total;
    @Basic(optional = false)
    @NotNull
    @Column(name = "order_id")
    private int orderId;

    public PlaceOrder() {
    }

    public PlaceOrder(Integer id) {
        this.id = id;
    }

    public PlaceOrder(Integer id, String name, String email, String address, int zipcode, String phone, int total, int orderId) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.zipcode = zipcode;
        this.phone = phone;
        this.total = total;
        this.orderId = orderId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
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
        if (!(object instanceof PlaceOrder)) {
            return false;
        }
        PlaceOrder other = (PlaceOrder) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.PlaceOrder[ id=" + id + " ]";
    }
    
}
