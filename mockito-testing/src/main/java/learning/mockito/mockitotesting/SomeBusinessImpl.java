package learning.mockito.mockitotesting;

public class SomeBusinessImpl {
	private DataService dataService;
	
	public SomeBusinessImpl(DataService service) {
		this.dataService = service;
	}
	
	public int findGreatest() {
		int[] allData = dataService.retrieveAllData();
		int value = Integer.MIN_VALUE;
		for (int v: allData) {
			if (v > value) {
				value = v;
			}
		}
		return value; 
	}
	
}
