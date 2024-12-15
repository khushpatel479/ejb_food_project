/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package ejb;

import entity.Cart;
import java.util.Collection;
import javax.ejb.Local;
import entity.FoodItems;
import entity.ExploreItem;
import entity.PlaceOrder;
import entity.Signup;
/**
 *
 * @author Acer
 */
@Local
public interface bean_1Local {
    Collection<FoodItems> getimg();
    public void add(String name , String img);
    public Collection<ExploreItem> imgdis();
    public boolean addcart(String mail , String name , String img , Integer pri);
    public void addsign(String name , String email , String pass,String add , Integer zipcode);
    public void updsign(Integer id,String name , String email , String pass,String add , Integer zipcode);
    public Collection<Signup> signdis(String email);
    public Boolean login(String email , String pass);
    public Collection<Cart> discart(String email);
    public Number gettot(String email);
    public void delcart(Integer id);
    public void addplace(String name , String email , String address , Integer zip , String phone , Integer tot,Integer oid);
    public Collection<PlaceOrder> getid(String email);
    public Collection<PlaceOrder> getplaceorder(String email);

}
