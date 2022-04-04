package springaop.com.imooc.aop.security;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import springaop.com.imooc.aop.AuthService;

/**
 * @program: springaop.com.imooc.aop.security
 * @description:
 * @author: 86138_town
 * @create date: 2022/3/30 22 56
 */
@Aspect
@Component
public class SecurityAspect {

    @Autowired
    AuthService authService;

    @Pointcut("@annotation(AdminOnly)")
    public void adminOnly() {

    }

    @Before("adminOnly()")
    public void check() {
        authService.checkService();
    }


}
