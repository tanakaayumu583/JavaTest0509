package jp.co.aforce.test;

public class MinMax {
	int getMaxValue(int a,int b,int c ) {
		int max_num = a;
		
		if(max_num < b){
			max_num = b;
		}
		if(max_num < c) {
			max_num = c;
		}
		return max_num;
	}
	
	int getMinValue(int a,int b,int c ) {
		int min_num = a ;
		
		if(min_num > b){
			min_num = b;
		}
		if(min_num > c) {
			min_num = c;
		}
		return min_num;
	}
}
