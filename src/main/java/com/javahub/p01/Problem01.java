package com.javahub.p01;

import java.util.Collections;
import java.util.List;


public class Problem01 {
	
	public void groupBySize() {
		FruitDataProvider fruitDataProvider = new FruitDataProvider();
		List<Fruit> fruitsList = fruitDataProvider.dataProvider();
		
		Collections.sort(fruitsList, new SizeComparator());
		System.out.println("MIN ID "+fruitsList.get(0).getId()+
				"\nMAX ID "+fruitsList.get(fruitsList.size()-1).getId());
		
	}
	
    public static void main( String[] args ) {
       /*Problem01 problem = new Problem01();
       problem.groupBySize();*/
    	
    }
}
