package z;

public class pr 
{
public static void main(String[] args) {
	
	
	
	int num=5;
	
	int b=0;
	
	
	for(int i=2; i<num; i++)
		
	{
		
		
		int c=num%i;
		
		if(c==0)
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
		
		System.out.println("prime umber");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
