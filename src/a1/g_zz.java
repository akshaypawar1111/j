package a1;

public class g_zz 
{
public static void main(String[] args) {
	
	
	
	int a=153;
	int b=0;
	
	
	for(int i=a; i>0; i=i/10)
	{
		
		int cc=i%10;
		
		b=b+(cc*cc*cc);
		
		
	}
	
	
	System.out.println(b);
	
	
	
	if(b==a)
	{
		
		System.out.println("number is armstrong");
	}
	
	else
	{
		System.out.println("number is  NOT armstrong");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
