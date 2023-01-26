package a1;

public class g_armtrong_number3 
{
public static void main(String[] args) {
	
	
	
	int a=46655;
	int b=0;
	
	
	for(int i=a; i>0; i=i/10)
	{
		
		int c=i%10;
		
		b=b+(c*c*c);
	}
	
	System.out.println(b);
	
	
	if(a==b)
	{
		
		System.out.println("number is armtrong");
	}
	
	else
	{
		System.out.println("number is not armtrong");
	}
	
	
	
	
}
}
