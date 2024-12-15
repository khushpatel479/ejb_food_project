/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package ejb;

import entity.Cart;
import entity.Signup;
import entity.ExploreItem;
import entity.FoodItems;
import entity.PlaceOrder;
import java.util.Collection;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
/**
 *
 * @author Acer
 */
@Stateless
public class bean_1 implements bean_1Local {
@PersistenceContext(unitName = "myfu") EntityManager em;
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public Collection<FoodItems> getimg() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
Collection<FoodItems> img = em.createNamedQuery("FoodItems.findAll").getResultList();
return img;
    }

    @Override
    public void add(String name, String img) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
ExploreItem em1 = new ExploreItem();
        em1.setImg(img);
        em1.setName(name);
        em.persist(em1);
    }

    @Override
    public Collection<ExploreItem> imgdis() {
        return em.createNamedQuery("ExploreItem.findAll").getResultList();
    }

    @Override
    public boolean addcart(String mail, String name, String img, Integer pri) {
        try{
        Cart vb = new Cart();
        vb.setName(name);
        vb.setEmail(mail);
        vb.setImg(img);
        vb.setPrice(pri);
        em.persist(vb);
        return true;
        }
        catch(Exception e){
            return false;
        }
    }

    @Override
    public void addsign(String name, String email, String pass ,String address,Integer zip) {
        Signup nm = new Signup();
        nm.setName(name);
        nm.setEmail(email);
        nm.setPass(pass);
        nm.setAddress(address);
        nm.setZipcode(zip);
        em.persist(nm);
    }

    @Override
  public Boolean login(String email, String pass) {
    TypedQuery<Signup> op = em.createQuery("SELECT l FROM Signup l WHERE l.email = :email AND l.pass = :pass", Signup.class);
    op.setParameter("email", email);
    op.setParameter("pass", pass);
    return !op.getResultList().isEmpty(); // Return true if results are not empty.
}

    @Override
    public Collection<Cart> discart(String email) {
return em.createNamedQuery("Cart.findByEmail",Cart.class).setParameter("email", email).getResultList();

    }

    @Override
    public Number gettot(String email) {
          List<?> resultList = em.createNamedQuery("Cart.calculateTotalPriceByEmail", Cart.class)
                           .setParameter("email", email)
                           .getResultList();

    if (resultList != null && !resultList.isEmpty()) {
        Object mn = resultList.get(0); // Get the first element from the list
        return mn != null ? ((Number) mn).intValue() : 0;
    }
    return 0;
    }

    @Override
    public void delcart(Integer id) {
        Cart up = em.find(Cart.class, id);
        em.remove(up);
    }

    @Override
    public void updsign(Integer id, String name, String email, String pass, String add, Integer zipcode) {
        Signup e= em.find(Signup.class, id);
        e.setName(name);
        e.setEmail(email);
        e.setPass(pass);
        e.setAddress(add);
        e.setZipcode(zipcode);
        em.merge(e);
    }

    @Override
    public Collection<Signup> signdis(String email) {
        return em.createNamedQuery("Signup.findByEmail",Signup.class).setParameter("email", email).getResultList();
        
    }

    @Override
    public void addplace(String name, String email, String address, Integer zip, String phone, Integer tot, Integer oid) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
PlaceOrder bn = new PlaceOrder();
bn.setName(name);
bn.setEmail(email);
bn.setAddress(address);
bn.setZipcode(zip);
bn.setPhone(phone);
bn.setTotal(tot);
bn.setOrderId(oid);
em.persist(bn);
    }

    @Override
    public Collection<PlaceOrder> getid(String email) {
        return em.createNamedQuery("PlaceOrder.findByEmail",PlaceOrder.class).setParameter("email", email).getResultList();
    }

    @Override
    public Collection<PlaceOrder> getplaceorder(String email) {
        return em.createNamedQuery("PlaceOrder.findByEmail",PlaceOrder.class).setParameter("email", email).getResultList();
    }
    


}

