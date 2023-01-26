package z;

public class pr1 
{
public static void main(String[] args) {
	
	
	
	int a=11;
	
	int b=0;
	
	
	for(int i=2; i<a; i++)
	{
		
		int c=a%i;
		
		if(c==0)
		{
			
			b++;
			break;
			
		}
		
		if(b==1)
		{
			
			System.out.println("not prime");
		}
		
		else
		{
			
			System.out.println("prime");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
