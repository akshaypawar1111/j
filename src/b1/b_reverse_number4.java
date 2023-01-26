package b1;

public class b_reverse_number4 
{
public static void main(String[] args) {
	
	
	int num1=123456789;
	
	String n = Integer.toString(num1);
	
	
	String m="";
	
	
	for(int i=n.length()-1; i>=0; i--)
	
	{
		
		
		m=m+n.charAt(i);
		
		
		
	}
	
	  int value = Integer.parseInt(m);
	
	
	
	System.out.println(value);
	
	
	
	
}
}
