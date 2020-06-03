package com.Mockito.demo.mockito;

public class SomeBusinessImpl {
	
	private DataService dataService;
	
	public SomeBusinessImpl(DataService dataServiceStub) {
		
		super();
		this.dataService= dataServiceStub;

	}




	int findTheGreatestFromAllData() {
		int[] data= dataService.retrieveAllData();
		int greatest= Integer.MIN_VALUE;
		
		for(int value: data) {
			if(value>greatest) {
				greatest=value;
			}
		}
		return greatest;
	}
}
