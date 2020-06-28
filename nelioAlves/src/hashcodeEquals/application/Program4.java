package application;

import entities.Client;

public class Program4 {

	public static void main(String[] args) {
	
		
		Client c1 = new Client("Maria", "maria@email.com");
		Client c2 = new Client("Alex", "alex@email.com");
		
		System.out.println(c1);
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));

	}

}
