package z;

public class pal2
{
public static void main(String[] args) {
	
	String a="madam";
	
	String b="";
	
	for(int i=a.length()-1; i>=0; i--)
		
	{
		
		
		b=b+a.charAt(i);
		
		
		
	}
	
	
	System.out.println(b);
	
	
	
	
	if(b.equals(a))
	{
		
		System.out.println("p");
	}
	
	
	else
	{
		System.out.println("not p");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
