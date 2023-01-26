package p;

public class i
{
public static void main(String[] args) {
	
	
	String a="aksha  a   y";
	
	
	int c=0;
	
	
	for(int i=0; i<=a.length()-1; i++)
	{
		
		char dd = a.charAt(i);
		
		if(dd==' ')
		{
			
			c++;
			
		}
		
	}
	
	System.out.println(c);
	
}
}
