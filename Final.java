package calculator;

import java.util.Scanner;

public class Final {
public static void main(String[] args) {
	
	Scanner scan= new Scanner(System.in);
	System.out.println("WELCOME TO CALCULATOR");
	System.out.println("Enter the choice");
	System.out.println("===========");
	calculator obj=new calculatorImpl();
while(true) {
	System.out.println("1:ADDITION\n2:SUBTRACTION\n3:MULTIPLICATION\n4:DIVISION\n5:EXIT\n ");
	
	int choice=scan.nextInt();
	switch(choice) {
	case 1:
	    obj.add();
	    break;
	
	case 2:
		obj.sub();
		break;
		
	case 3:
		obj.mul();
		break;	
		
	case 4:
		obj.div();
		break;
	
	case 5:
		System.out.println("Thank you!!");
		System.exit(0);
		break;
		
	default:
		System.out.println("Enter the valid choice");
	}
}

}}
