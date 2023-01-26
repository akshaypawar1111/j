package p;

public class e 
{
public static void main(String[] args) {
	
	
	int a=371;
	
	int b=0;
	
	
	for(int i=a; i>0; i=i/10)
	{
		
		
		int c=i%10;
		
		b=b+(c*c*c);
		
		
		
	}
	
	System.out.println(b);
	
	
	
	if(b==a)
	{
		
		System.out.println("given number is armstrong number");
	}
	
	else
	{
		
		System.out.println("not");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
