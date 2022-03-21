package learning.mockito.mockitotesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class SomeBusinessImplTest {

	private SomeBusinessImpl businessImpl;
	
	@BeforeEach
	void beforeEach() {
		businessImpl = new SomeBusinessImpl(new DataServiceStub());
	}
	
	@Test
	void testFindGreatest() {
		int max = businessImpl.findGreatest();
		assertEquals(20, max);
	}

}

class DataServiceStub implements DataService {

	@Override
	public int[] retrieveAllData() {
		return new int[] {20, 3, 0};
	}
	
}