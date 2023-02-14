package anudip;

public class TypeCasting {
	public static void main(String args[]) {
		int x=446;// Assigning the value
		long z=x; // it will auto convert to int to long coz of widening
		System.out.println(x);
		System.out.println(z);
		double y=x; // it will auto convert int to double
		System.out.println(y);
		//Narrowing means small to long 
		double d=444.5;
		int i=(int)d;// here it will convert double to int 
		System.out.println(i);
		
		
	}

}












