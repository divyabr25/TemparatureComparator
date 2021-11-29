package com.qa.ui.tests;

import com.qa.sourceFactory.TemparatureSourceFactory;
import com.qa.tempInterface.TemparatureInterface;

public class TestRunner {
	

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Layer = null;
		//String APILayer = "API";
		String City = args[1];
		
		TemparatureSourceFactory getSrc = new TemparatureSourceFactory();
		TemparatureInterface tempInterface = getSrc.getSource(Layer);
		if(Layer.equals("UI Layer")) {
			tempInterface.getTemperature(City);
		}
		else if(Layer.equals("APi Layer")){
			tempInterface.getTemperature(City);
		}
		
		
		}

}
