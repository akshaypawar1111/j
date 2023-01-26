package a1;

public class g_armtrong_number2 
{
public static void main(String[] args) {
	
	
	
	int num1=54562;
	int num2=0;
	
	
	for(int i=num1; i>0; i=i/10)
	
	{
		int rex=i%10;
		
		num2=num2+(rex*rex*rex);
		
	}
	
	System.out.println(num2);
	
	if(num1==num2)
	
	{
		
		System.out.println("number is armtrong");
	}
	
	else
	{
		System.out.println("number is NOT  armtrong");
	}
	
	
	
	
	
	
	
	
	
}
}
