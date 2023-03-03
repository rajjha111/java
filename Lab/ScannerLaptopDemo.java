package lab2ndMarch;
import java.util.*;

public class ScannerLaptopDemo {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int option;
	do {
		System.out.println("Enter a option:\n +"
				+ "1-Add\n"+"2-Substract\n"+
				"3-Multiply\n"+
				"4-Even/Odd number\n"
				+"5-Quit");
		
	option=sc.nextInt();
	switch(option) {
	case 1:
		System.out.println("Enter two numbers to be added");
		double num1=sc.nextInt();
		double num2=sc.nextInt();
		double result= num1+num2;
		System.out.println("The result is "+ result);
		
	case 2:
		System.out.println("Enter two numbers to be substracted");
	    num1=sc.nextInt();
	    num2=sc.nextInt();
		result= num1-num2;
		System.out.println("The result is "+ result);
		
		
	case 3:
		System.out.println("Enter two numbers to be multiplied");
		num1=sc.nextInt();
		num2=sc.nextInt();
		result= num1*num2;
		System.out.println("The result is "+ result);
		
	case 4:
		System.out.println("Enter numbers to check even or add ");
		num1 =sc.nextInt();
		if (num1%2==0){
			 System.out.println(num1 + " is an even number");
		}
		else {
			System.out.println(num1 + " is an odd number");
		}
		break;
	case 5:
        System.out.println("Exiting the program...");
        break;
	  default:
          System.out.println("Invalid option. Please enter a valid option.");   
		
		
	}
	}
	while(option !=5);
}
}
