package a1;

public class e_pallindrome_1 
{
public static void main(String[] args) {
	
	
	String a1="MADAM";
	
	String b1="";
	
	
	for(int i=a1.length()-1; i>=0;i-- )
	{
		b1=b1+a1.charAt(i);
		
	}	
	
	System.out.println(b1);
	
	
	if(b1.equals(a1))
	{
		
		System.out.println("string is pallindrome");
	}
	
	else
	{
		System.out.println("string is not pallindrome");
	}
	
	
	
}
}
