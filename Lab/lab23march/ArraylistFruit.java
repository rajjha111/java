package lab23march;

import java.util.ArrayList;

public class ArraylistFruit { //created a class
	public static void main(String[] args) {
		ArrayList<String> Fruits =new ArrayList<String>(); //adding array list object 
		
		//adding some fruits to traverse 
		Fruits.add("mango");
		Fruits.add("orange");
		Fruits.add("grapes");
		Fruits.add("apple");
	
		//1.traversing  with for loop
		System.out.println("Traverssing with for loop");
		for(int i=0;i< Fruits.size();i++)
		{
			System.out.println(Fruits.get(i));
		}
		// Traverse the list using a for-each loop
		System.out.println("Traverssing with for-each loop");
		for (String fruit:Fruits)
		{
			System.out.println(fruit);
		}
		
		//Traverse using while loop
		System.out.println("Traverssing with while loop");
		int i=0;
		while( i < Fruits.size()) {
			System.out.println(Fruits.get(i));
			i++;
			
		} 
	}
	

}
