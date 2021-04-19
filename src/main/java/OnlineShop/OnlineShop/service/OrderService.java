package OnlineShop.OnlineShop.service;

import OnlineShop.OnlineShop.model.Order;
import OnlineShop.OnlineShop.model.User;

import java.util.List;

public interface OrderService {

    List<Order> findAll();

    Order save(Order order);

    List<Order> findOrderByUser(User user);

}
