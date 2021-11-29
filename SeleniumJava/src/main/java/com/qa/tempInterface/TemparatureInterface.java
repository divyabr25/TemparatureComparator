package com.qa.tempInterface;

public interface TemparatureInterface {
	
	/**
	 * returns the temperature in degree celsius for the provided city
	 * returns -1 if error occurs
	 * @param city
	 * @return
	 */
	float getTemperature (String city);
	
	

}
