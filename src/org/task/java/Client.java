package org.task.java;

public class Client extends Employee {//child 1
	
	private void clientID() {
		System.out.println("MY id 1430");

	}
	public static void main(String[] args) {
		Client s = new Client();
		s.clientID();
		s.empID();
		
	}

}
