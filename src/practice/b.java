package practice;

public class b 
{
public static void main(String[] args) {
	
	
	
	int a=451245;
	
	String s = Integer.toString(a);
	
	String t="";
	
	
	
	for(int i=s.length()-1; i>=0; i--)
	{
		
		
		t=t+s.charAt(i);
		
		
	}
	
	
	int vv = Integer.parseInt(t);
	
	
	System.out.println(vv);
	
	
	
	
	
	
	
	
}
}
