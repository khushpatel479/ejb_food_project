/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Acer
 */
@Entity
@Table(name = "explore_item")
@NamedQueries({
    @NamedQuery(name = "ExploreItem.findAll", query = "SELECT e FROM ExploreItem e"),
    @NamedQuery(name = "ExploreItem.findById", query = "SELECT e FROM ExploreItem e WHERE e.id = :id"),
    @NamedQuery(name = "ExploreItem.findByName", query = "SELECT e FROM ExploreItem e WHERE e.name = :name"),
    @NamedQuery(name = "ExploreItem.findByImg", query = "SELECT e FROM ExploreItem e WHERE e.img = :img")})
public class ExploreItem implements Serializable {

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
    @Size(min = 1, max = 100)
    @Column(name = "img")
    private String img;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "exploreId")
    private Collection<FoodItems> foodItemsCollection;

    public ExploreItem() {
    }

    public ExploreItem(Integer id) {
        this.id = id;
    }

    public ExploreItem(Integer id, String name, String img) {
        this.id = id;
        this.name = name;
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Collection<FoodItems> getFoodItemsCollection() {
        return foodItemsCollection;
    }

    public void setFoodItemsCollection(Collection<FoodItems> foodItemsCollection) {
        this.foodItemsCollection = foodItemsCollection;
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
        if (!(object instanceof ExploreItem)) {
            return false;
        }
        ExploreItem other = (ExploreItem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ExploreItem[ id=" + id + " ]";
    }
    
}
