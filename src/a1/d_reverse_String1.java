package a1;

public class d_reverse_String1 
{
public static void main(String[] args) {
	
	
	
	String original= "abcd";
	String a="";
	
	
	for(int i=original.length()-1; i>=0; i--)
	{
		
		
		a=a+original.charAt(i);
		
	}
	
	System.out.println(original);
	System.out.println(a);
	
	
	
	
	
	
	
	
	
	
	
}
}
