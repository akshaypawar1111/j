package a1;

public class gc 
{
public static void main(String[] args) {
	
	
	
	int a=153;
	int b=0;
	
	
	for(int i=a; i>0; i=i/10)

	{
		
		
		int value=i%10;
		
		b=b+(value*value*value);
		
	}
	
	System.out.println(b);
	
	
	if(a==b)
	{
		
		System.out.println("number is armstrom number");
	}
	
	
	
	else
	{
		System.out.println("number iis not a armstorm number");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
