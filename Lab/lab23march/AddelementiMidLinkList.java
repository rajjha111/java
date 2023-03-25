package lab23march;

import java.util.LinkedList;

public class AddelementiMidLinkList {
public static void main(String[] args) {
	LinkedList<String> list=new LinkedList<String>();
	list.add("apple");
	list.add("orange ");
	list.add("mango");
	list.add("pineapple");
	list.add("grapes");
	list.add("jackfruit");
	System.out.println("all ellements:-"+list);
	//to add ellment in middle
	int middle=list.size()/2;
	list.add(middle, "hello");
	System.out.println("updated list will be :-" +list);
	
}
}
