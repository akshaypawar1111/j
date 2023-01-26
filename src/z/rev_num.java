package z;

public class rev_num 
{
public static void main(String[] args) {
	
	
	int a=10022;
	
	String t = Integer.toString(a);
	
	
	String b="";
	
	for(int i=t.length()-1; i>=0; i--)
	{
		
		b=b+t.charAt(i);
		
		
	}
	
	
	int pp = Integer.parseInt(b);
	
	
	System.out.println(pp);
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
