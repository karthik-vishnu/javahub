package com.javahub.p01;

import java.util.Comparator;

public class SizeComparator implements Comparator<Fruit> {

	public int compare(Fruit fruit1, Fruit fruit2) {
		Integer fruit1Size = fruit1.getSize();
		Integer fruit2Size = fruit2.getSize();
		
		return fruit1Size.compareTo(fruit2Size);
	}
}
