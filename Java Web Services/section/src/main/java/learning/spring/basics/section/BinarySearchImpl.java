package learning.spring.basics.section;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	@Autowired
	private SortAlgo sortAlgo;
	
//	public BinarySearchImpl(SortAlgo sortAlgo) {
//		this.sortAlgo = sortAlgo;
//	}
	
	
	
	public int binarySearch(int[] numbers, int numberToSearch) {
		
		int[] array = sortAlgo.sort(numbers);
		System.out.println(sortAlgo);
		
		// Implement Searching on Sorted Array
		
		return 3;
	}

	public SortAlgo getSortAlgo() {
		return sortAlgo;
	}

	public void setSortAlgo(SortAlgo sortAlgo) {
		this.sortAlgo = sortAlgo;
	}

}
