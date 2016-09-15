package com.javahub.p02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.javahub.p01.Color;
import com.javahub.p01.Fruit;
import com.javahub.p01.FruitDataProvider;

public class Problem02 {
	Map<String, Integer> map;
	
	public void groupByColor() {
		FruitDataProvider fruitDataProvider = new FruitDataProvider();
		List<Fruit> fruitList = fruitDataProvider.dataProvider1();
		Collections.sort(fruitList, new ColorComparator());
		map = new HashMap<String, Integer>();
		
		findMinMaxNumberOfFruits(fruitList);
		findMinMaxSizeOfFruit(fruitList);
	}
	
	public void findMinMaxNumberOfFruits(List<Fruit> listOfFruits) {
		for(Color color:Color.values()) {
			int count = 0;
			for(int i=0; i<listOfFruits.size(); i++) {
				if(color == listOfFruits.get(i).getColor()) {
					++count;
				}
			}
			map.put(color.toString(), count);
		}
		List<Entry<String, Integer>> listofmap = new ArrayList<Entry<String,Integer>>(map.entrySet());
		Collections.sort(listofmap, new com.javahub.p02.SizeComparator());
		System.out.println("MIN : Color = "+listofmap.get(0).getKey()+ " Size = "+listofmap.get(0).getValue()
				+"\nMAX : Color = "+listofmap.get(listofmap.size()-1).getKey()+ " Size = "+listofmap.get(listofmap.size()-1).getValue());
	}
	
	public void findMinMaxSizeOfFruit(List<Fruit> listOfFruits) {
		List<Integer> list;
		for(Color color : Color.values()) {
			list = new ArrayList<Integer>();
			for(int i=0; i<listOfFruits.size(); i++){
				if(color == listOfFruits.get(i).getColor()){
					list.add(listOfFruits.get(i).getSize());
				}
			}
			System.out.println("COLOR : "+color+" MIN = "+list.get(0)+" MAX = "+list.get(list.size()-1));
		}
	}
	
	public static void main(String[] args) {
		Problem02 problem02 = new Problem02();
		problem02.groupByColor();
	}
}
