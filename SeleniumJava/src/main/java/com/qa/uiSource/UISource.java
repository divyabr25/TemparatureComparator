package com.qa.uiSource;

import com.qa.tempInterface.TemparatureInterface;
import com.qa.ui.pages.SearchPage;
import com.qa.ui.pages.SearchResultPage;

public class UISource implements TemparatureInterface {
	
	
	@Override
	public float getTemperature(String city)  {
		SearchPage spt = new SearchPage();
		// TODO Auto-generated method stub
		float temperature = -1;
		SearchResultPage searchResult =spt.Search(city);
		temperature = searchResult.getUITemp();
		System.out.println(temperature);
		return temperature;
	}


}
