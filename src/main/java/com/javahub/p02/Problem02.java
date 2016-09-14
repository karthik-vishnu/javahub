package com.javahub.p02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.javahub.p01.Color;
import com.javahub.p01.Fruit;
import com.javahub.p01.FruitDataProvider;
import com.javahub.p01.SizeComparator;
import com.javahub.p01.Type;

public class Problem02 {

	public void groupByColor() {
		FruitDataProvider fruitDataProvider = new FruitDataProvider();
		List<Fruit> fruitList = fruitDataProvider.dataProvider1();
		
		Collections.sort(fruitList, new SizeComparator());
		System.out.println("Minimum size of fruit "+fruitList.get(0).getSize()+ 
				"\nMaximum size of fruit "+fruitList.get(fruitList.size()-1).getSize());
		
		Collections.sort(fruitList, new ColorComparator());
		for(Color clr:Color.values()){
			int count = 0;
			for(int i=0; i<fruitList.size(); i++){
				if(clr == fruitList.get(i).getColor()){
					++count;
				}
			}
			System.out.println("Color "+clr+" count "+count );
		}
	}
	
	public static void main(String[] args) {
		Problem02 problem02 = new Problem02();
		problem02.groupByColor();
	}
}
