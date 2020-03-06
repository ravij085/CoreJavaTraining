package com.yessInfoTech.abstractclassAndinterface;

public  class ImplementEmployee implements EmployeeInterface{

	
	public ImplementEmployee() {
	System.out.println("from thr implememnting class ocnstructor ");
	}
	@Override
	public void draw() {
		System.out.println("from the implements method");
		
	}

	
}
