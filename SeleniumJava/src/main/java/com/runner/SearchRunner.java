package com.runner;

import com.qa.exception.TemparatureNotInVariance;
import com.qa.sourceFactory.TemparatureSourceFactory;
import com.qa.tempInterface.TemparatureInterface;

public class SearchRunner {
	int Variance;
	
	public SearchRunner() {
		this.Variance = 0;
	}
	
	public void searchCity(String City) {
	String Layer1 = "UI";
	String Layer2 = "API";
	TemparatureSourceFactory getSrc = new TemparatureSourceFactory();
	TemparatureInterface tempInterface1 = getSrc.getSource(Layer1);
	float UITemp = tempInterface1.getTemperature(City);
	//float UITemp = 25;
	TemparatureInterface tempInterface2 = getSrc.getSource(Layer2);
	float APITemp = tempInterface2.getTemperature(City);
	
	Comparator compare = new Comparator();
	float VarianceCompare = compare.CompareTemp(UITemp,APITemp);
	try {
		compare.Variance(VarianceCompare,Variance);
	} catch (TemparatureNotInVariance e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	
	}
}


