package p1;

public class rev_string_number 
{
public static void main(String[] args) {
	
	
	
	
	int num=484651;
	
	String s1 = Integer.toString(num);
	
	
	String s2="";
	
	
	for(int i=s1.length()-1; i>=0; i--)
	
	{
		
		
		s2=s2+s1.charAt(i);
		
		
	}
	
	
	int value = Integer.parseInt(s2);
	
	
	
	System.out.println(value);
	
	
	
}
}
