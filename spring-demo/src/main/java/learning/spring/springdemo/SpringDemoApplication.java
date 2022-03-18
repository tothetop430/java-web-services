package learning.spring.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringDemoApplication.class);
		System.out.println(context.getApplicationName());
		System.out.println(123);
		((AbstractApplicationContext) context).close();
	}

}
