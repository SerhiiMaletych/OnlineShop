package OnlineShop.OnlineShop;

import OnlineShop.OnlineShop.repository.UserRepository;
import OnlineShop.OnlineShop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class UserServiceTests {

    @Autowired
    private UserService userService;

    @MockBean
    private UserRepository userRepository;
}
