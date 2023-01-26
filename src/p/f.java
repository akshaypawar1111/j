package p;

public class f 
{
public static void main(String[] args) {
	
	
	int a=20001;
	
	String s1 = Integer.toString(a);
	
	
	String s2="";
	
	
	
	for(int i=s1.length()-1; i>=0; i--)
	{
		
		
		s2=s2+s1.charAt(i);
		
		
		
		
	}
	
	int revnumber = Integer.parseInt(s2);
	
	System.out.println(revnumber);
	
	
	
	
	
	
	
	
	
	
	
	
}
}
