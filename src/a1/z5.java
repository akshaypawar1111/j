package a1;

public class z5
{
public static void main(String[] args) {
	
	
	int a=4512462;
	
	String num = Integer.toString(a);
	String num2="";
	
	
	for(int i=num.length()-1; i>=0; i--)
	{
		
		num2=num2+num.charAt(i);
		
	}
	
	int final1 = Integer.parseInt(num2);
	
	
	
	System.out.println(final1);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
