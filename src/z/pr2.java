package z;

import java.util.Scanner;

public class pr2 
{
public static void main(String[] args) {
	
	
	
	Scanner s =new Scanner(System.in);
	
	int ff = s.nextInt();
	
	
	
	
	int b=0;
	
	
	
	for(int i=2; i<ff; i++)
		
	{
		
		int c=ff%i;
		
		if(c==0)
		{
			b++;
			break;
			
		}
		
		
		
	}
	
	
	if(b==1)
	{
		
		System.out.println("not prime");
	}
	
	
	else
	{
		
		System.out.println("prime ");
	}
	
	
	
	
	
	
	
	
	
	
}
}
