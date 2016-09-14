package com.javahub.p01;

import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Problem01 {
	
	public void groupBySize() {
		FruitDataProvider fruitDataProvider = new FruitDataProvider();
		List<Fruit> fruitsList = fruitDataProvider.dataProvider();
		
		Collections.sort(fruitsList, new SizeComparator());
		String[] id = {fruitsList.get(0).getId(), fruitsList.get(fruitsList.size()-1).getId()};
		System.out.println("MIN ID "+fruitsList.get(0).getId()+
				"\nMAX ID "+fruitsList.get(fruitsList.size()-1).getId());
		
		//This will display all the values in the list. If the size is same it will sort  by its type
		for(int i=0; i<fruitsList.size(); i++){
			System.out.println("id "+fruitsList.get(i).getId()+ "size "
					+fruitsList.get(i).getSize()+ "Type "+fruitsList.get(i).getType());
		}
	}
	
    public static void main( String[] args ) {
       /*Problem01 problem = new Problem01();
       problem.groupBySize();*/
    	
    }
}
