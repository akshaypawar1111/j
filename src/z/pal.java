package z;

public class pal 
{
public static void main(String[] args) {
	
	
	
	String a1="akshay";
	String b1="";
	
	
	
	for(int i=a1.length()-1; i>=0; i--)
	
	{
		
		b1=b1+a1.charAt(i);
		
		
		
	}
	
	
	System.out.println(b1);
	
	
	if(b1.equals(a1))
	{
		
		System.out.println("given string is pallindrome");
	}
	
	
	else
	{
		
		System.out.println("not pallindrome");
	}
	
	
	
	
	
	
	
	
	
	
}
}
