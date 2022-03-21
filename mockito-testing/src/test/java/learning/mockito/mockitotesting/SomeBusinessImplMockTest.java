package learning.mockito.mockitotesting;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.*;

class SomeBusinessImplMockTest {

	private SomeBusinessImpl business;
	
	@BeforeEach
	void beforeEach() {
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {20, 3, 10});
		business = new SomeBusinessImpl(dataServiceMock);
	}
	
	@Test
	void test() {
		assertEquals(20, business.findGreatest());
	}

}
