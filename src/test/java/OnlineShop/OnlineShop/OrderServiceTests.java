package OnlineShop.OnlineShop;

import OnlineShop.OnlineShop.repository.OrderRepository;
import OnlineShop.OnlineShop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class OrderServiceTests {
    @Autowired
    private OrderService orderService;

    @MockBean
    private OrderRepository orderRepository;
}
