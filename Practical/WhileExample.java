package anudip;
import java.util.Scanner;

public class WhileExample {
	public void calcTable(int number)
	{
		int i=1;
		while(i<=10) {
			System.out.println(number +"X"+ i+"=" +number*i);
			i++;
		}
	}


public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a nymber  : ");
	int number=s.nextInt();
	WhileExample tb=new WhileExample();
	tb.calcTable(number);
}
}

