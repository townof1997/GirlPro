package springaop.com.imooc.aop;

import org.springframework.stereotype.Component;
import springaop.com.imooc.aop.security.CurrentUserHolder;
import org.springframework.stereotype.Service;

/**
 * @program: SpringAOP.com.imooc.aop.service
 * @description:
 * @author: 86138_town
 * @create date: 2022/3/30 22 38
 */
@Component
public class AuthService {
    public void checkService() {
        String user = CurrentUserHolder.get();
        if (!"admin".equals(user)) {
            throw new RuntimeException("operation not allow");
        }
    }

}
