package z;

public class rev
{
public static void main(String[] args) {
	
	
	int a=98511;
	
	String yy = Integer.toString(a);
	String b="";
	
	for(int i=yy.length()-1; i>=0; i--)
	
	{
		
		b=b+yy.charAt(i);
		
		
	}
	
	
	
	int tt = Integer.parseInt(b);
	
	
	System.out.println(tt);
	
	
	
	
	
	
	
	
	
	
	
	
}
}
