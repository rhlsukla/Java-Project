package com.trainingbasket.poly.beans;

public class Manager extends Employee {

	String department;

	public Manager(String name, int age, int id, String department) {
		super(name, age, id);
		this.department = department;
	}

	@Override
	public String toString() {
		return super.toString() + "\n Department :" + this.department;
	}
}
