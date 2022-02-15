package com.qa.sourceFactory;

import org.json.JSONObject;

import com.qa.restAPI.APISource;
import com.qa.tempInterface.TemparatureInterface;
import com.qa.uiSource.UISource;

public class TemparatureSourceFactory {
	//public String Source = null;
	
	TemparatureInterface uiSource = new UISource();
	TemparatureInterface apiSource = new APISource();
	
	public TemparatureInterface getSource(String src) {	
	if(src.equals("UI")) {
		return uiSource; 
	}
	else if(src.equals("API")) {
		return apiSource;
	}
	return null;
		
		
	}

}
