package com.javahub.p01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FruitDataProvider {

	public List<Fruit> dataProvider(){
		Fruit data1 = new Fruit("214", Type.Apple, Color.Red, 55);
		Fruit data2 = new Fruit("123", Type.Mango, Color.Yellow, 10);
		Fruit data3 = new Fruit("435", Type.Orange, Color.Orange, 9);
		
		List<Fruit> fruitsList = new ArrayList<Fruit>();
		fruitsList.add(data1);
		fruitsList.add(data2);
		fruitsList.add(data3);
		
		return fruitsList;
	}
}
