package p;

public class prime2 
{
public static void main(String[] args) {
	
	
	
	
	int a=5;
	int b=0;
	
	
	for(int i=2; i<a; i++)
	{
		
		if(a%i==0)
		{
			
			b++;
			break;
			
			
		}
		
		
	}
	
	if(b==1)
	{
		
		System.out.println("not a prime number");
	}
	
	
	else
	{
		
		System.out.println("prime number ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
