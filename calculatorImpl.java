package calculator;

import java.util.LinkedHashMap;
import java.util.Scanner;

class calculatorImpl implements calculator{
	Scanner scan=new Scanner(System.in);
  

	@Override
	public void add() {
			System.out.println("enter the value of a ");
			System.out.println("enter the value of b ");
			int a=scan.nextInt();
			int b=scan.nextInt();
			int c=a+b;
			System.out.println(c);
			System.out.println();
	}

	@Override
	public void sub() {
		System.out.println("enter the value of a ");
		System.out.println("enter the value of b ");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=a-b;
		System.out.println(c);
		System.out.println();
	}

	@Override
	public void mul() {
		System.out.println("enter the value of a ");
		System.out.println("enter the value of b ");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=a*b;
		System.out.println(c);
		System.out.println();
	}

	@Override
	public void div() {
		System.out.println("enter the value of a ");
		System.out.println("enter the value of b ");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=a/b;
		System.out.println(c);
		System.out.println();
				
	}

}
