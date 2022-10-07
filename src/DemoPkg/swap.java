package DemoPkg;

import java.util.Scanner;

public class swap {

	public static void main(String[] args) 
	{
		int a= 10, b=20 , temp;
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter no a is: "); //10
		System.out.print("Enter no b is: "); //20
		
		a= sc.nextInt();
		b=sc.nextInt();
		
		temp= a;// Tempt=10
		a=b;  //a=20
		b=temp; //b=10;
		 
		System.out.print("After Swapping:"+a+" "+b);
		System.out.println();

	}

}
