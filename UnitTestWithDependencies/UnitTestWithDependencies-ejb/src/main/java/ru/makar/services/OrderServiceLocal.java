package ru.makar.services;

import java.util.List;
import javax.ejb.Local;
import ru.makar.models.UserOrder;

@Local
public interface OrderServiceLocal {
    void addOrder(String adress, String customer, double weight);
    List<UserOrder> getAllOrders();
    double calcOrderPrice(int orderID);
}
