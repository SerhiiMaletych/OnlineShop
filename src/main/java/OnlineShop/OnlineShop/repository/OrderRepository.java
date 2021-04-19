package OnlineShop.OnlineShop.repository;

import OnlineShop.OnlineShop.model.Order;
import OnlineShop.OnlineShop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findOrderByUser(User user);


}
