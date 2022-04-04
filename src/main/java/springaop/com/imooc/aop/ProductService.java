package springaop.com.imooc.aop.service;

import springaop.com.imooc.aop.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public void insert(Product product) {
        authService.checkService();
        System.out.println("insert product");
    }

    public void delete(Long id) {
        authService.checkService();
        System.out.println("delete product id");
    }

}

   