package anudip;

public class allOperator {
	public  void Increment() {
		System.out.println("__________________");
		int x=10;
		System.out.println(x++);// 10 is now 11
		System.out.println(x++);// 11 is now 12
		System.out.println(++x);// 13 is now 13 coz in stating only its doing increment
		System.out.println(x++); //13 is now 14
		System.out.println(x);// now print 14 at last

	}
	public void decrement() {
		System.out.println("__________________");
        int x=10;
        System.out.println(x--);// 10 is now 9
		System.out.println(x--);// 9 is now 8
		System.out.println(--x);// 7 is now 7 coz in stating only its doing increment
		System.out.println(x--); //7 is now 6
		System.out.println(x);// now print 6 at last

	}
	public void comparisonop() {
		System.out.println("__________________");
		int x=14;
		int y=6;
		 System.out.println(x<y);
		 System.out.println(x==y);
		 System.out.println(y<x);
	}
	public void logocalOp() {
		System.out.println("__________________");
		int x=14;
		int y=6;
		 System.out.println((x>y)&& (x++<y));
		 System.out.println((x>y) || (x++<y));
		 
	}
	public void bitwiseop() {
		System.out.println("__________________");
	        int x = 6;
	        int y = 5;
	        System.out.println((x > y) && (x++ < y));
	        System.out.println((x > y) & (x++ < y));
	        System.out.println((x > y) | (x++ > y));
	}
	  public void ternaryOperator() {
		  System.out.println("__________________");
	        int a = 2;
	        int b = 3;
	        int c = (a < b) ? a : b;
	        System.out.println(c);
	    }

	public static void main(String[] args) {
		allOperator op=new allOperator();
		op.Increment();
		op.decrement();
		op.comparisonop();
		op.logocalOp();
		op.bitwiseop();
		op.ternaryOperator();
		
	}

}
