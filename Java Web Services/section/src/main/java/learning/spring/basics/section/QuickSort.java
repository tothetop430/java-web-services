package learning.spring.basics.section;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSort implements SortAlgo {
	
	public int[] sort(int[] numbers) {
		// perform quick sort
		return numbers;
	}

}