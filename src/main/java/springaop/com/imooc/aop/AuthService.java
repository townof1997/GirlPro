package springaop.com.imooc.aop.service;

import springaop.com.imooc.aop.security.CurrentUserHolder;
import org.springframework.stereotype.Service;

/**
 * @program: SpringAOP.com.imooc.aop.service
 * @description:
 * @author: 86138_town
 * @create date: 2022/3/30 22 38
 */
@Service
public class AuthService {
    public void checkService() {
        String user = CurrentUserHolder.get();
        if (!"admin".equals(user)) {
            throw new RuntimeException("operation not allow");
        }
    }

}
