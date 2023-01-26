package b1;

public class b_reverse_number1
{
public static void main(String[] args) {
	
	
	int num=1234;
	
	
	String v = Integer.toString(num);           //integer.toString()  --> to convert number to string
	
	String b="";
	
	for(int i=v.length()-1; i>=0;i--)
	{
		
		
		
		b=b+v.charAt(i);
		
		
	}
	
	
	int value = Integer.parseInt(b);       //integer.parseInt()  --> to convert String  to number
	
	
	System.out.println(value);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
