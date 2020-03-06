package com.yessInfoTech.abstractclassAndinterface;

public abstract class Employee {
	
	abstract void work();
	int a = 10;
	
	public Employee() {
		System.out.println("constractor of employee class");
	}

}

class PerEmployee extends Employee{
	
	public PerEmployee() {
	System.out.println("from the constrctor of per employee");
	}

	@Override
	void work() {
		System.out.println("from work method of PermEmployee");
		
	}
	
	
	
	
	
}
