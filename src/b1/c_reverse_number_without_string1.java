package b1;

public class c_reverse_number_without_string1
{
public static void main(String[] args)
{

	
	int a=5412;
	int b=0;
	
	
	for(int i=a; i>0; i= i/10)
	{
		
		int c=i%10;
		
		b=b*10+c;   //   2145
		
	}	
	
	System.out.println(b);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
