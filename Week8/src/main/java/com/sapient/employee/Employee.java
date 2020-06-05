package com.sapient.employee;

public class Employee {
	private int id;
	String name;
	String city;

	public Employee(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public int getId() {
		return id;
	}

}
