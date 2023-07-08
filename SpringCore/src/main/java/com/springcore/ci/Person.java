package com.springcore.ci;

public class Person {
	private String name;
	private int id;
	private Certificate certi;
	public Person(String name, int id , Certificate certi) {
		super();
		this.name = name;
		this.id = id;
		this.certi = certi;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", certi=" + certi + "]";
	}
	
	
	
}
