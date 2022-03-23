package learning.springaop.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAuth {
	
	private Logger logger = LoggerFactory.getLogger(UserAuth.class);
	
	@Before("execution(* learning.springaop.aop.business.*.*(..))")
	public void userAuthorization(JoinPoint joinPoint) {
		logger.info("Checking user authorization...");
		logger.info("User allowed to access {}", joinPoint);
	}
	
	@After("execution(* learning.springaop.aop.business.*.*(..))")
	public void userAuthAfter(JoinPoint joinPoint) {
		logger.info("Logging User out...");
		logger.info("Closing the method call {}", joinPoint);
	}
	
}
