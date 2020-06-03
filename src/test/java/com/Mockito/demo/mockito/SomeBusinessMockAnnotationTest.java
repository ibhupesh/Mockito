package com.Mockito.demo.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)

class SomeBusinessMockAnnotationTest {
	
	@Mock 
	DataService dataServiceMock;
	
	@InjectMocks
	SomeBusinessImpl businessImpl;
	
	@Test
	void testFindTheGreatestFromAllData() {
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24,15,3});
		
		assertEquals(24,businessImpl.findTheGreatestFromAllData());
		
	}
	
	@Test
	void testFindTheGreatestFromAllData_ForOneValue() {
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24});
		assertEquals(24,businessImpl.findTheGreatestFromAllData());
		
	}

}
