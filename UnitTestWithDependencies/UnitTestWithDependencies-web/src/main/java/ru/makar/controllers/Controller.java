package ru.makar.controllers;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import ru.makar.models.UserOrder;
import ru.makar.services.OrderServiceLocal;

@Named
@SessionScoped
public class Controller implements Serializable{

    @EJB
    private OrderServiceLocal orderService;
    
    private String adress;
    private String customer;
    private double weight;

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public List<UserOrder> getAllOrders() {
        return orderService.getAllOrders();
    }

    public void addOrder() {
        orderService.addOrder(adress, customer, weight);
        adress = "";
        customer = "";
        weight = 0;
    }
    
    public double calcOrderPrice(int id) {
        return orderService.calcOrderPrice(id);
    }
}