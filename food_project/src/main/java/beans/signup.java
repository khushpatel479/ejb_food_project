/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import ejb.bean_1Local;
import javax.ejb.EJB;
@ManagedBean(name = "pp")
@SessionScoped
public class signup {
    @EJB bean_1Local nm;
    Integer id,zipcode;
    String name,email,pass,address;
    
    public String add()
    {
        nm.addsign(name, email, pass,address,zipcode);
        return "login/faces-redirect=true";
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

    
    
}
