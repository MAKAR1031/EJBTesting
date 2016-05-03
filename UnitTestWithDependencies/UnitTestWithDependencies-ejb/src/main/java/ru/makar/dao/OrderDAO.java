package ru.makar.dao;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import ru.makar.models.UserOrder;

@Stateless
@LocalBean
public class OrderDAO {

    @PersistenceContext(unitName = "ru.makar_UnitTestWithDependencies-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;


    public UserOrder getOrder(int orderID) {
        return em.find(UserOrder.class, orderID);
    }
    
    public void addOrder(UserOrder order) {
        em.persist(order);
    }

    public List<UserOrder> getAllOrders() {
        Query query = em.createQuery("SELECT o FROM UserOrder o", UserOrder.class);
        return query.getResultList();
    }
}
