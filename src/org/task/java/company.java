package org.task.java;

public class company extends Employee {//child 2
	
	private void copmID() {
		System.out.println("company ID is1234");

	}
	public static void main(String[] args) {
		company c = new company();
		c.copmID();
		c.empID();
		
	}

}
