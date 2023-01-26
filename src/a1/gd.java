package a1;

public class gd
{
public static void main(String[] args) {
	
	
	
	
	int a=370;
	
	int b=0;
	
	
	for(int i=a; i>0; i=i/10)
		
	{
		
		
		int c=i%10;
		
		b=b+(c*c*c);             // b=0 // b=343  //b=27    therefore= b=0+343+27=370
		
		
	}
	
	
	System.out.println(b);
	
	
	if(b==a)
	{
		
		System.out.println("given number is armstrong ");
	}
	
	
	
	else
	{
		
		System.out.println("given number is NOT armstrong ");
	}
	
	
	
	
	
	
	
	
	
	
	
}
}
