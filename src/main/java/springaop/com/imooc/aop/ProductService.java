package springaop.com.imooc.aop;

import springaop.com.imooc.aop.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springaop.com.imooc.aop.security.AdminOnly;

/**
 * @program: SpringAOP.com.imooc.aop.service
 * @description:
 * @author: 86138_town
 * @create date: 2022/3/30 22 32
 */
@Service
public class ProductService {

    @Autowired
    AuthService authService;

    @AdminOnly
    public void insert(Product product) {
//        authService.checkService();
        System.out.println("insert product");
    }

    @AdminOnly
    public void delete(Long id) {
//        authService.checkService();
        System.out.println("delete product id");
    }

}

   