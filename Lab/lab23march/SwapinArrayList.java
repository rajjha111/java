package lab23march;

// 5. WAP a java program to swap to elements in arrayList.

import java.util.ArrayList;
import java.util.Collections;

public class SwapinArrayList {
	
public static void main(String[] args) {
	ArrayList<String> list =new ArrayList<String>();
	list.add("apple");
	list.add("mango");
	list.add("orange");
	list.add("grapes");
	list.add("pineapple");
	System.out.println("original list: " +list);
	//swap index 1 with 4
	Collections.swap(list, 1, 4);
	
	System.out.println("updated list :" + list);
}
}
