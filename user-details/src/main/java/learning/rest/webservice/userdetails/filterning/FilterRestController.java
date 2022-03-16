package learning.rest.webservice.userdetails.filterning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilterRestController {
	
	@GetMapping(path="/filtered")
	public SomeBean getSomeBean() {
		return new SomeBean("1", "2", "3");
	}
	
}
