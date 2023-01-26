package b1;

public class e_count_whiteSpaces
{
public static void main(String[] args) {
	
	
	
	
	String a="ab c bk   s   fg";
	
	
	int  count =0;
	
	
	
	for(int i=0; i<=a.length()-1; i++)
	{
		
		
		char c = a.charAt(i);      //a
		
		if(c==' ')
		{
			
			count++;
		
			
			
		}
		
		
	}
	
	
	
	System.out.println(count);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
