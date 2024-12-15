/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import ejb.bean_1Local;
import javax.ejb.EJB;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
@ManagedBean(name = "lp")
@SessionScoped
public class login {
    @EJB bean_1Local nm;
    Integer id;
    String name,email,pass;
    
    public String add()
    {
       if (nm.login(email, pass))
       {
           FacesContext context = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) context.getExternalContext().getSession(true);
         session.setAttribute("userEmail", email);
        session.setAttribute("userPass", pass);
           return "index1?faces-redirect=true";
             

        // Set session attributes
       
       }
       else
       {
           return "sorry";
       }
       
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

    
    
}
