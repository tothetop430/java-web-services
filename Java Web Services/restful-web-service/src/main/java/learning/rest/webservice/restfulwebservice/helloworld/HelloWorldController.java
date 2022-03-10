package learning.rest.webservice.restfulwebservice.helloworld;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class HelloWorldController {
	
	@GetMapping(path="/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World, you are learning Spring");
	}
	
	@GetMapping(path="/hello-world-bean/{name}")
	public HelloWorldBean helloWorldBeanWithName(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World, %s is learning Spring", name));
	}

}
