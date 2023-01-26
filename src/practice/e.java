package practice;

public class e
{
public static void main(String[] args) {
	
	
	String p="mom";
	
	
	String v="";
	
	
	for(int i=p.length()-1; i>=0; i--)
	{
		
		
		v=v+p.charAt(i);
		
		
	}
	
	
	System.out.println(v);
	
	
	if(v.equals(p))
	{
		System.out.println("given string is pallindrome");
	}
	
	
	else 
	{
		
		System.out.println("not");
	}
	
	
	
	
	
	
	
	
	
	
}
}
