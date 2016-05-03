package ru.makar.services;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import ru.makar.dao.OrderDAO;
import ru.makar.models.UserOrder;

@Stateless
public class OrderService implements OrderServiceLocal {

    @EJB
    private OrderDAO orderDAO;

    public OrderService() {}

    public OrderService(OrderDAO mock) {
        this.orderDAO = mock;
    }
    
    @Override
    public void addOrder(String adress, String customer, double weight) {
        UserOrder order = new UserOrder();
        order.setAdress(adress);
        order.setCustomer(customer);
        order.setWeight(weight);
        orderDAO.addOrder(order);
    }

    @Override
    public List<UserOrder> getAllOrders() {
        return orderDAO.getAllOrders();
    }

    @Override
    public double calcOrderPrice(int orderID) {
        UserOrder order = orderDAO.getOrder(orderID);
        return order != null ? order.getWeight() * 20 : 0;
    }
}
