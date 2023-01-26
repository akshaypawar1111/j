package b1;

public class c_reverse_number_without_string2 
{
public static void main(String[] args)
{

	
	int num=6495;
	int a=0;
	
	
	for(int i=num; i>0; i=i/10)
	
	{
		
		int ss=i%10;
		
		a=a*10+ss;
	}
	
	System.out.println(a);
	
	
	
	
	
	
	
}
}
