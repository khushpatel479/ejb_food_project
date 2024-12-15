/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

import ejb.bean_1Local;
import entity.PlaceOrder;

import entity.Signup;
import java.util.Collection;
import java.util.Random;

import javax.ejb.EJB;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

@ManagedBean(name = "sm")
@SessionScoped
public class check {
    @EJB bean_1Local nm;
    Integer id,zipcode,total,orderId;
    String name,email,pass,address,phone;
    Collection<Signup> cv;
    Signup curr;
     public Collection<PlaceOrder> pm;
     
     public void vbd()
     {
         FacesContext context = FacesContext.getCurrentInstance();
         HttpSession session = (HttpSession) context.getExternalContext().getSession(true);
         String km = (String) session.getAttribute("userEmail");
         pm=nm.getid(km);
     }
     
     public Collection<PlaceOrder> getPm()
     {
         return pm;
     }
             
     
  public void upd()
  {
      id = curr.getId();
      name = curr.getName();
      email = curr.getEmail();
      pass = curr.getPass();
      address = curr.getAddress();
      zipcode = curr.getZipcode();
      nm.updsign(id, name, email, pass, address, zipcode);
  }
  public String nav1()
  {
      return "updsign?faces-redirect=true";
  }
  public String nav2()
  {
      return "place?faces-redirect=true";
  }
  public void gene()
  {
      Random random = new Random();
        this.orderId = random.nextInt(1000) + 1; 
  }
 
    public void cvv()
    {
         FacesContext context = FacesContext.getCurrentInstance();
         HttpSession session = (HttpSession) context.getExternalContext().getSession(true);
         String km = (String) session.getAttribute("userEmail");
       cv =  nm.signdis(km);
    }
    public void addpl()
    {
        gene();
        vbd();
      name = curr.getName();
      email = curr.getEmail();
      pass = curr.getPass();
      address = curr.getAddress();
      zipcode = curr.getZipcode();
       FacesContext context = FacesContext.getCurrentInstance();
         HttpSession session = (HttpSession) context.getExternalContext().getSession(true);
         Integer km = (Integer) session.getAttribute("tot");
      nm.addplace(name, email, address, zipcode, phone, km, orderId);
    }
    public Collection<Signup> getCv()
    {
        return cv;
    }
    public Signup getCurr()
    {
        return curr;
    }
    public void setCurr(Signup curr)
    {
        this.curr = curr;
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

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getZipcode() {
        return zipcode;
    }

    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }
    
    
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
    
}
