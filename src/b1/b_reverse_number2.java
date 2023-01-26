package b1;

public class b_reverse_number2 
{
public static void main(String[] args) {
	
	
	int a=89282;
	
	String s1 = Integer.toString(a);
	
	
	String t="";
	
	
	for(int i=s1.length()-1; i>=0; i--)
	{
		
		t=t+s1.charAt(i);
		
		
	}
	
	int value = Integer.parseInt(t);
	
	System.out.println(value);
	
	
	
	
	
}
}
