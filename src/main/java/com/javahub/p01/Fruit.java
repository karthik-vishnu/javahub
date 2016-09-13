package com.javahub.p01;

public class Fruit {

	private String id;
	private Enum<Type> type;
	private Enum<Color> color;
	private int size;
	
	public Fruit(String id, Enum<Type> type, Enum<Color> color, int size){
		this.id = id;
		this.type = type;
		this.color = color;
		this.size = size;
	}
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Enum<Type> getType() {
		return type;
	}

	public void setType(Enum<Type> type) {
		this.type = type;
	}

	public Enum<Color> getColor() {
		return color;
	}

	public void setColor(Enum<Color> color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	
}
