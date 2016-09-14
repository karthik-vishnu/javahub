package com.javahub.p02;

import java.util.Comparator;

import com.javahub.p01.Fruit;

public class ColorComparator implements Comparator<Fruit> {

	public int compare(Fruit fruit1, Fruit fruit2) {
		String fruit1Color = fruit1.getColor().toString();
		String fruit2Color = fruit2.getColor().toString();
		
		if(fruit1Color.equals(fruit2Color)){
			Integer fruit1Size = fruit1.getSize();
			Integer fruit2Size = fruit2.getSize();
			
			return fruit1Size.compareTo(fruit2Size);
		}
		return fruit1Color.compareTo(fruit2Color);
	}

}
