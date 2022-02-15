package com.runner;

import com.qa.exception.TemparatureNotInVariance;
import com.qa.sourceFactory.TemparatureSourceFactory;
import com.qa.tempInterface.TemparatureInterface;

public class ComparatorRunner {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println(args.length);
		System.out.println(args[0]);
				String Layer1 = "UI";
				String Layer2 = "API";
				String City = null;
				String Variance = null;
				
				//default city and variance
			if(args.length==0) {
				System.out.println("City is null");
					City = "Chennai";
					Variance = "1";
							
				}
				else if(args.length==1){
					System.out.println("Variance s null");
					 City = args[0];
					 Variance = "1";
				}
			
				int IntVariance = Integer.parseInt(Variance);
				TemparatureSourceFactory getSrc = new TemparatureSourceFactory();
				TemparatureInterface tempInterface1 = getSrc.getSource(Layer1);
				float UITemp = tempInterface1.getTemperature(City);
				//float UITemp = 25;
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
