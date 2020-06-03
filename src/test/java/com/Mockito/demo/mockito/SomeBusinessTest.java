package com.Mockito.demo.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SomeBusinessTest {

	@Test
	void testFindTheGreatestFromAllData() {
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
		int result=businessImpl.findTheGreatestFromAllData();
		assertEquals(24, result);
		
	}

}

class DataServiceStub implements DataService {

	@Override
	public int[] retrieveAllData() {
		
		return new int [] {24,6,15};
	}
	
}
