package a1;

public class z7 
{
public static void main(String[] args) {
	
	
	
	String a="MOM";
	
	String b="";
	
	
	
	
	for(int i=a.length()-1;i<=0; i--)
	{
		
		
		b=b+a.charAt(i);
		
	}
	
	System.out.println(b);
	
	
	
	if(a==b)
	{
		
		System.out.println("given string is pallindrome");
	}
	
	else
	{
		System.out.println("given string is  NOT pallindrome");
	}
	
	
	
	
	
	
	
	
}
}
