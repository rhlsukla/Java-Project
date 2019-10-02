package com.trainingbasket.poly.beans;

public class Employee {
	String name;
	int age;
	int id;

	public Employee(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}

	public String toString() {
		return "ID : " + this.id + "\nName :" + this.name + "\nAge : " + this.age;
	}

}
