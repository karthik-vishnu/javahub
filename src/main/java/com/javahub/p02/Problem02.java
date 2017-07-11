package com.javahub.p02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import org.omg.CORBA.ValueBaseHolder;

import com.java.myprojects.MySystem;
import com.javahub.p01.Color;
import com.javahub.p01.Fruit;
import com.javahub.p01.FruitDataProvider;

public class Problem02 {
	Map<String, Integer> map;
	public int a = 0;
	
	ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>(){
		protected Object value() {
			return new Integer(++a);
		}
		
		InheritableThreadLocal<Integer> inherit = new InheritableThreadLocal<Integer>(){
			protected Integer childValue(Integer parentValue) {
				return new Integer(++a);
			};
		};
	};
	/*public static Object get(){
		System.out.println(new Problem02().threadLocal.get());
		return new Problem02().threadLocal.get();
	}*/
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
	
	public static void main(String[] args) throws Exception {
		/*Problem02 problem02 = new Problem02();
		problem02.groupByColor();*/
		
		File file = new File("E:/Javadocs/myzip.rar");
		
		
	/*	ZipEntry entry1 = new ZipEntry("one.txt");
		ZipEntry entry2 = new ZipEntry("two.txt");
		ZipEntry entry3 = new ZipEntry("three.txt");

		ZipOutputStream outputStream = new ZipOutputStream(new FileOutputStream(file));
		outputStream.putNextEntry(entry1);
		outputStream.putNextEntry(entry2);
		outputStream.putNextEntry(entry3);
		outputStream.close();*/
		
		ZipInputStream inputStream = new ZipInputStream(new FileInputStream(file));
		ZipFile zfile = new ZipFile(file);
		Enumeration<? extends ZipEntry> entry = zfile.entries();
		while (entry.hasMoreElements()) {
			ZipEntry zipEntry = (ZipEntry) entry.nextElement();
			
		}
		
		
	}
}
