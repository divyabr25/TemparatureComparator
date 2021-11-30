package com.qa.tests;

import com.qa.exception.TemparatureNotInVariance;

public class Comparator {
	public String Message = null;
	public float DifferenceTemp = 0;
		public float CompareTemp(float UITemp, float APITemp) {
		// TODO Auto-generated method stub
			
			if(UITemp == APITemp) {
				DifferenceTemp = 0;
			}
			else {
				DifferenceTemp = UITemp - APITemp; //
				if(DifferenceTemp < 0) {
					DifferenceTemp*=-1;
					
				}
			}
		return DifferenceTemp;
	}
		
		public void Variance(float Differ,int Var) throws TemparatureNotInVariance {
			//0.25,1
			if(Differ>Var) {
				 throw new TemparatureNotInVariance("Temparature difference not in variance") ;
				
			}
			
	}	
		
}
