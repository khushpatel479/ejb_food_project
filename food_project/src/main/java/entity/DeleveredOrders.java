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
@Table(name = "delevered_orders")
@NamedQueries({
    @NamedQuery(name = "DeleveredOrders.findAll", query = "SELECT d FROM DeleveredOrders d"),
    @NamedQuery(name = "DeleveredOrders.findById", query = "SELECT d FROM DeleveredOrders d WHERE d.id = :id"),
    @NamedQuery(name = "DeleveredOrders.findByQuantity", query = "SELECT d FROM DeleveredOrders d WHERE d.quantity = :quantity"),
    @NamedQuery(name = "DeleveredOrders.findByTotalAmount", query = "SELECT d FROM DeleveredOrders d WHERE d.totalAmount = :totalAmount"),
    @NamedQuery(name = "DeleveredOrders.findByOrderId", query = "SELECT d FROM DeleveredOrders d WHERE d.orderId = :orderId"),
    @NamedQuery(name = "DeleveredOrders.findByEmail", query = "SELECT d FROM DeleveredOrders d WHERE d.email = :email"),
    @NamedQuery(name = "DeleveredOrders.findByDate", query = "SELECT d FROM DeleveredOrders d WHERE d.date = :date"),
    @NamedQuery(name = "DeleveredOrders.findByAddress", query = "SELECT d FROM DeleveredOrders d WHERE d.address = :address")})
public class DeleveredOrders implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "quantity")
    private int quantity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "total_amount")
    private int totalAmount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "order_id")
    private int orderId;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "date")
    private String date;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "address")
    private String address;

    public DeleveredOrders() {
    }

    public DeleveredOrders(Integer id) {
        this.id = id;
    }

    public DeleveredOrders(Integer id, int quantity, int totalAmount, int orderId, String email, String date, String address) {
        this.id = id;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
        this.orderId = orderId;
        this.email = email;
        this.date = date;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
        if (!(object instanceof DeleveredOrders)) {
            return false;
        }
        DeleveredOrders other = (DeleveredOrders) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.DeleveredOrders[ id=" + id + " ]";
    }
    
}
