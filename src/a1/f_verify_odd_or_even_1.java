package a1;

import java.util.Scanner;

public class f_verify_odd_or_even_1
{
public static void main(String[] args)
{

	
	Scanner s =new Scanner(System.in);
	
	int num = s.nextInt();
	
	System.out.println(num);
	
	
	
	if(num % 2==0)   // from this we get reminder
	
	{
		
		System.out.println("number is even");
	}
	
	else
	{
		
		System.out.println("number is odd");
	}
	
	
	
}
}
