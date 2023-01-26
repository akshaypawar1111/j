package b1;

public class a_prime_number1 
{
public static void main(String[] args) {
	
	
	int a=11;
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
		System.out.println("number is not a  prime number");
	}
	
	else
	{
		System.out.println("number is a prime number");
	}
}
}
