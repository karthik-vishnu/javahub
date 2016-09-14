package com.javahub.p02;

import java.util.Collections;
import java.util.List;

import com.javahub.p01.Fruit;
import com.javahub.p01.FruitDataProvider;

public class Problem02 {

	public void groupByColor() {
		FruitDataProvider fruitDataProvider = new FruitDataProvider();
		List<Fruit> fruitList = fruitDataProvider.dataProvider1();
		Collections.sort(fruitList, new SizeComparator());
		
		for(int i=0; i<fruitList.size(); i++){
			System.out.println("Color "+fruitList.get(i));
		}
	}
}
