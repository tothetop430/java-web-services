package learning.mockito.mockitotesting;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SomeBusinessImplMockAnnotationsTest {

	@Mock
	private DataService dataService;
	
	@InjectMocks
	private SomeBusinessImpl business;
	
	@Test
	void test() {
		when(dataService.retrieveAllData()).thenReturn(new int[] {20, 3, 10});
		assertEquals(20, business.findGreatest());
	}

}
