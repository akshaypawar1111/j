package a1;

public class g_armtrong_number1 
{
public static void main(String[] args) {
	
	
	int num=153;              //1*1+5*5+3*3=153
	int a=0;
	
	
	       //153     153>0
	for(int i=num;   i>0;   i=i/10)
	{
		
		
		int r=i%10;   //153 mod 10=3  
		              //15 mod 10=5
                      //1 mod 10=1		
		
		
		
		a=a+(r*r*r);    //  0+ 3*3*3=27
		                //  0+5*5*5=125
		                //   0+1*1*1*=1
	}
	System.out.println(a);
	
	if(a==num)
	System.out.println("number is armtrong");

	
	else
	{
		System.out.println("number is not armtrong ");
	}
	
	
	
	
	
	
	
}
}
