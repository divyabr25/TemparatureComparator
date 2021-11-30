package com.runner;

import com.qa.exception.TemparatureNotInVariance;
import com.qa.sourceFactory.TemparatureSourceFactory;
import com.qa.tempInterface.TemparatureInterface;
import com.qa.tests.Comparator;

public class ComparatorRunner {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
				String Layer1 = "UI";
				String Layer2 = "API";
				String City = args[1];
				String Variance = args[2];
				
				//default city and variance
				if(City== null) {
					City = "Bengaluru,KA";
							
				}
				else if(Variance == null) {
					Variance = "1";
				}
				int IntVariance = Integer.parseInt(Variance);
				TemparatureSourceFactory getSrc = new TemparatureSourceFactory();
				TemparatureInterface tempInterface1 = getSrc.getSource(Layer1);
				float UITemp = tempInterface1.getTemperature(City);
				TemparatureInterface tempInterface2 = getSrc.getSource(Layer2);
				float APITemp = tempInterface2.getTemperature(City);
				
				Comparator compare = new Comparator();
				float VarianceCompare = compare.CompareTemp(UITemp,APITemp);
				try {
					compare.Variance(VarianceCompare,IntVariance);
				} catch (TemparatureNotInVariance e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				
				}

	}
