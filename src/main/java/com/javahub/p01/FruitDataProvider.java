package com.javahub.p01;

import java.util.ArrayList;
import java.util.List;

public class FruitDataProvider {

	public List<Fruit> dataProvider() {
		Fruit data1 = new Fruit("123", Type.Mango, Color.Yellow, 2);
		Fruit data2 = new Fruit("214", Type.Apple, Color.Red, 55);
		Fruit data3 = new Fruit("435", Type.Orange, Color.Orange, 9);
		
		List<Fruit> fruitsList = new ArrayList<Fruit>();
		fruitsList.add(data1);
		fruitsList.add(data2);
		fruitsList.add(data3);
		
		return fruitsList;
	}
	
	public List<Fruit> dataProvider1() {
		Fruit data1 = new Fruit("123", Type.Mango, Color.Yellow, 22);
		Fruit data2 = new Fruit("823", Type.Apple, Color.Red, 12);
		Fruit data3 = new Fruit("183", Type.Orange, Color.Orange, 32);
		Fruit data4 = new Fruit("128", Type.Orange, Color.Orange, 42);
		Fruit data5 = new Fruit("129", Type.Mango, Color.Yellow, 20);
		Fruit data6 = new Fruit("435", Type.Orange, Color.Orange, 9);
		
		List<Fruit> fruitsList = new ArrayList<Fruit>();
		fruitsList.add(data1);
		fruitsList.add(data2);
		fruitsList.add(data3);
		fruitsList.add(data4);
		fruitsList.add(data5);
		fruitsList.add(data6);
		
		return fruitsList;
	}
}
