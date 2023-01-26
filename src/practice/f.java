package practice;

public class f
{
public static void main(String[] args) {
	
	
	int a=1523; 
	int c=0;
	
	
	for(int i=a; i>0; i=i/10)
	{
		
		int vv=i%10;   //3
		
		
		c=c+(vv*vv*vv);
		
		
	}
	
	System.out.println(c);
	
	
	
	
	if(c==a)
	{
		
		System.out.println("given number is armstrong number");
	}
	
	
	else
	{
		
		System.out.println("not armstrong");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
}
