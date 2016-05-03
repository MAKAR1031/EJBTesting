package tests;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.AdditionalMatchers;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.runners.MockitoJUnitRunner;
import ru.makar.dao.OrderDAO;
import ru.makar.models.UserOrder;
import ru.makar.services.OrderService;

@RunWith(MockitoJUnitRunner.class)
public class OrderServiceTests {

    @Mock
    private OrderDAO mockDAO;
    
    private OrderService service;
    
    @Before
    public void setUp() {
        UserOrder order = new UserOrder();
        order.setId(1);
        order.setAdress("Владмир");
        order.setCustomer("Сергей");
        order.setWeight(1);
        
        when(mockDAO.getOrder(1)).thenReturn(order);
        when(mockDAO.getOrder(AdditionalMatchers.gt(1))).thenReturn(null);
        
        this.service = new OrderService(mockDAO);
    }
    
    @Test
    public void priceCalcTest() {
        assertTrue(20 == service.calcOrderPrice(1));
    }
    
    @Test
    public void nullOrderTest() {
        assertTrue(0 == service.calcOrderPrice(123412));
    }
    
}
