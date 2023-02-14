package anudip;

public class VariableExample {
	static int num=55;//static variable
	long num1=343253;// instance variable
	
	public void display() { //non static method
		char c='h';//local variable
		 System.out.println("local variable= " +c);
		 	 
	}
	public static void cal() {
		double b=121.34;
		int num2=123;
		double res=b*num2;
		System.out.println("the value wiil be "+res);
		
		
	}
	public static void main(String[] args) {
		
		VariableExample obj=new VariableExample();
		obj.display();
		
		System.out.println("instance varible :"+obj.num1 );
		
		System.out.println("static varible :"+VariableExample.num);
		
	}

}



