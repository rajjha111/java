import java.util.Scanner;
class calusingscase{
  public static void main(String[] args)
  {
	  Scanner input=new Scanner(System.in);
	  double num1,num2;
	  char operation;
	  System.out.println("enter two number");
	  num1=input.nextDouble();
	  num2=input.nextDouble();
	  System.out.println("enter operation");
	  operation=input.next().charAt(0);
	  switch(operation)
	  {
		  case '+':
		  System.out.println(num1+num2);
		  break;
		  case '-':
		  System.out.println(num1-num2);
		  break;
		  case '*':
		  System.out.println(num1*num2);
		  break;
		  case '/':
		  System.out.println(num1/num2);
		  break;
		  default:
		  System.out.println("invalid operator");
		  break;
		  
	  }
	  
	  
  }
	
	
	
}