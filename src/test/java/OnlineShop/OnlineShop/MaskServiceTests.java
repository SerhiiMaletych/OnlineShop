package OnlineShop.OnlineShop;

import OnlineShop.OnlineShop.repository.MaskRepository;
import OnlineShop.OnlineShop.service.MaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class MaskServiceTests {
    @Autowired
    private MaskService maskService;

    @MockBean
    private MaskRepository maskRepository;
}
