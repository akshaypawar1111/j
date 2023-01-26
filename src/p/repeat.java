package p;

import java.util.HashMap;

public class repeat 
{
public static void main(String[] args) 
{

	
	String a1= "abcaabbbcbdf";
	
	String a2="";
	
	
	
	HashMap<Character, Integer> h =new HashMap<Character, Integer>();
	
	
	for(int i=0; i<=a1.length()-1; i++)
		
	{
		
		char c = a1.charAt(i);
		
		if(h.containsKey(c))
		{
			
			h.put(c, h.get(c)+1);
			
		}
		
		else
		{
			
			h.put(c, 1);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
