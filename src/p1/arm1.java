package p1;

public class arm1
{
public static void main(String[] args)
{

	
	int a =370;
	
	int b=0;
	
	
	for(int i=a; i>0; i=i/10)
	{
		
		int s=i%10;
		
		b=b+(s*s*s);
		
		
		
	}
	
	System.out.println(b);
	
	if(b==a)
	{
		
		System.out.println("number is armstrong number");
	}
	
	else
	{
		
		System.out.println("number is NOT armstrong number");
	}
	
	
}
}
