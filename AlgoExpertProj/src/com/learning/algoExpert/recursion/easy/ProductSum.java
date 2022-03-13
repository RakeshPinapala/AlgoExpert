package com.learning.algoExpert.recursion.easy;

import java.util.ArrayList;
import java.util.List;

public class ProductSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> list = new ArrayList<Object>();
		list.add(5);
		list.add(2);
		list.add(new ArrayList<Object>() {
			{add(7);add(-1);}
		});
		list.add(3);
		list.add(new ArrayList<Object>() {
			{
				add(6);
				add(new ArrayList<Object>() {
					{
						add(-13);
						add(8);
					}
				});
				add(4);
			
			}
		});
		
		System.out.println(productSum(list));
	}
	
	
	 public static int productSum(List<Object> array) {
		    return prodSumIte(array,1);
	 }
	 
	 private static int prodSumIte(List<Object> array, int depth) {
		 int sum = 0;
		 for(Object ele : array) {
			 if(ele instanceof Integer) {
				 sum = sum + ((Integer) ele);
			 } else if(ele instanceof ArrayList) {
				 sum = sum + prodSumIte((List<Object>)ele,depth+1);
			 }
		 }
		 return sum*depth;
	 }

}
