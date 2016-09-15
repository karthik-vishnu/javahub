package com.javahub.p02;

import java.util.Comparator;
import java.util.Map.Entry;

public class SizeComparator implements Comparator<Entry<String, Integer>> {

	public int compare(Entry<String, Integer> entry1, Entry<String, Integer> entry2) {
		Integer entry1Value = entry1.getValue();
		Integer entry2Value = entry2.getValue();
		
		return entry1Value.compareTo(entry2Value);
	}

}
