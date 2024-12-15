
package beans;
import ejb.bean_1Local;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;

@ManagedBean(name = "op")
@SessionScoped
public class calls {
    
    private Integer id, price;
    private String img, name, email;

    // List to store cart items (name, image, price, email)
    
    
    @EJB bean_1Local nm;
    
    public String ins()
    {
        if(nm.addcart(email, name, img, price))
        {
            return("added");
        }
        else
        {
            return "login?faces-redirect=true";
        }
    }
    // Getters and Setters
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

 
    
   
}
