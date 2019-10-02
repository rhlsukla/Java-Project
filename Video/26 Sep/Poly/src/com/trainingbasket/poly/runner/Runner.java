package com.trainingbasket.poly.runner;

import com.trainingbasket.poly.beans.Employee;
import com.trainingbasket.poly.beans.Manager;

public class Runner {

	public static void main(String[] args) {
		Employee e = new Employee("Dheeraj", 30, 1);
		System.out.println(e.toString());
		System.out.println(e);
		e = new Manager("Amit", 44, 2, "Sales");
		System.out.println(e);
	}

}
