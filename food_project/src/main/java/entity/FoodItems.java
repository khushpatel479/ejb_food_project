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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "food_items")
@NamedQueries({
    @NamedQuery(name = "FoodItems.findAll", query = "SELECT f FROM FoodItems f"),
    @NamedQuery(name = "FoodItems.findById", query = "SELECT f FROM FoodItems f WHERE f.id = :id"),
    @NamedQuery(name = "FoodItems.findByName", query = "SELECT f FROM FoodItems f WHERE f.name = :name"),
    @NamedQuery(name = "FoodItems.findByPrice", query = "SELECT f FROM FoodItems f WHERE f.price = :price"),
    @NamedQuery(name = "FoodItems.findByDescription", query = "SELECT f FROM FoodItems f WHERE f.description = :description"),
    @NamedQuery(name = "FoodItems.findByImg", query = "SELECT f FROM FoodItems f WHERE f.img = :img")})
public class FoodItems implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "price")
    private int price;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "img")
    private String img;
    @JoinColumn(name = "explore_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private ExploreItem exploreId;

    public FoodItems() {
    }

    public FoodItems(Integer id) {
        this.id = id;
    }

    public FoodItems(Integer id, String name, int price, String description, String img) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.img = img;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public ExploreItem getExploreId() {
        return exploreId;
    }

    public void setExploreId(ExploreItem exploreId) {
        this.exploreId = exploreId;
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
        if (!(object instanceof FoodItems)) {
            return false;
        }
        FoodItems other = (FoodItems) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.FoodItems[ id=" + id + " ]";
    }
    
}
