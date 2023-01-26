package b1;

public class b_reverse_number3 
{
public static void main(String[] args) {
	
	
	
	
	int a=584962;
	
	
	String ww = Integer.toString(a);
	String qq="";
	
	for(int i=ww.length()-1; i>=0; i--)
	
	{
		
		qq=qq+ww.charAt(i);
		
	}
	
	int value = Integer.parseInt(qq);
	
	
	System.out.println(value);
	
	
	
	
	
	
	
	
	
	
}
}
