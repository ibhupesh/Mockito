package com.Mockito.demo.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;

class ListTest {

	@Test
	public void testGet_Specific() {
		List listMock=mock(List.class);
		
		when(listMock.get(0)).thenReturn("SomeString");
		assertEquals("SomeString", listMock.get(0));
		when(listMock.get(1)).thenReturn("Hello");
		assertEquals("Hello", listMock.get(1));
	}
	
	@Test
	public void testGet_GenericParameter() {
		List listMock=mock(List.class);
		
		when(listMock.get(Mockito.anyInt())).thenReturn("SomeString");
		assertEquals("SomeString", listMock.get(0));
		assertEquals("SomeString", listMock.get(1));
	}

}
