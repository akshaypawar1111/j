package p;

public class count_white_spaces 
{
public static void main(String[] args) {
	
	
	String a="aaa aaa hf sgf   ";
	
	int b=0;
	
	for(int i=0; i<=a.length()-1; i++)
	{
		
		char x = a.charAt(i);
		
		if(x==' ')
		{
			
			b++;
			
			
		}
		
		
		
	}
	
	System.out.println(b);
	
	
	
	
	
	
}
}
