package a1;

public class d_reverse1 
{
public static void main(String[] args) 
{

	
	String a="madam";
	
	String b="";
	
	
	for(int i=a.length()-1; i>=0; i--)
	{
		
		b=b+a.charAt(i);
		
		
		
		
	}
	
	
	System.out.println(b);
	
	
	
	if(b.equals(a))
	{
		System.out.println("given string is pallindrome");
	}
	
	else
	{
		
		System.out.println("given string is not pallindrome");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
