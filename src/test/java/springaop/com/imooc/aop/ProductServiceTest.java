package springaop.com.imooc.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import springaop.com.imooc.aop.security.CurrentUserHolder;

/**
 * @program: springaop.com.imooc.aop.service
 * @description:
 * @author: 86138_town
 * @create date: 2022/3/30 22 45
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceTest {

    @Autowired
    ProductService productService;

    @Test(expected = Exception.class)
    public void annoInsertTest() {
        CurrentUserHolder.set("town");
        productService.delete(1L);
    }

    @Test
    public void adminInsert() {
        CurrentUserHolder.set("town");
        productService.delete(1L);
    }
}


   