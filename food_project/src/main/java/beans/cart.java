/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;


import ejb.bean_1Local;
import entity.Cart;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.ejb.EJB;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

@ManagedBean(name = "cp")
@SessionScoped
public class cart {
    @EJB bean_1Local nm;
    String name , img,email;
    Integer price , id;
    Number tot;
    Collection<Cart> vb;
    Cart curr;
    public Number gettot()
    {
        FacesContext context = FacesContext.getCurrentInstance();
         HttpSession session = (HttpSession) context.getExternalContext().getSession(true);
                String km = (String) session.getAttribute("userEmail");
        tot= nm.gettot(km);
        session.setAttribute("tot", tot);
       return tot;
       
    }
    public Number getTot()
    {
        return tot;
    }
    public void del()
    {
        id = curr.getId();
        nm.delcart(id);
    }
    public void getcart()
    {
         FacesContext context = FacesContext.getCurrentInstance();
         HttpSession session = (HttpSession) context.getExternalContext().getSession(true);
                String km = (String) session.getAttribute("userEmail");
        vb=nm.discart(km);
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
    public Collection<Cart> getVb()
    {
        return vb;
    }
    public Cart getCurr()
    {
        return curr;
    }
    public void setCurr(Cart curr)
    {
        this.curr=curr;
    }
}
