package a1;

import java.util.Scanner;

public class g_b
{
public static void main(String[] args) {
	
	
	
	Scanner s=new Scanner(System.in);
	
	
	int a=17456;
	int b=0;
	
	
	for(int i=a; i>0; i=i/10)
	{
		
		int c=i%10;
		
		b=b+(c*c*c);
		
		
	}
	
	
	System.out.println(b);
	
	
	if(a==b)
	
	{
		
		System.out.println("given number is armstrog");
	}
	
	else
	{
		System.out.println("given number is not armstrog");
	}
	
	
}
}
