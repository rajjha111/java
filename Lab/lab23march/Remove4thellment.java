package lab23march;

import java.util.ArrayList;

//the code to remove the 4th element from an ArrayList:

public class Remove4thellment {
	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<String>();
		list.add("apple");
		list.add("mango");
		list.add("orange");
		list.add("grapes");
		list.add("pineapple");
		System.out.println("all elements are "+list);//Here it will print all the elements
		
		list.remove(3);//it will remove 4th element of the array
		System.out.println("updated lis is : "+list);
	}

}
