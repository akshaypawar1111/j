package a1;

public class e_pallindrome_2 
{
public static void main(String[] args) {
	
	
	
	String s="sos";
	String c="";
	
	
	
	for(int i=s.length()-1; i>=0; i--)
	{
		
		c=c+s.charAt(i);
		
	}
	
	System.out.println(c);
	
	
	if(s.equals(c))
	{
		System.out.println("string is pallindromne");
	}
	else
	{
		
		System.out.println("string is not pallindrome");
	}
}
}
