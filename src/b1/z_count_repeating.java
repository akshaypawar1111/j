package b1;

import java.util.HashMap;
import java.util.Set;

public class z_count_repeating 
{
public static void main(String[] args) {
	
	
	String s="abaacdebbbbccccs";
	
	HashMap<Character, Integer> h=new HashMap<Character, Integer>();
	
	
	for(int i=0; i<=s.length()-1; i++)
		
	{
		
		char ch = s.charAt(i);
		
		
		if(h.containsKey(ch))
		{
			
			h.put(ch, h.get(ch)+1);
			
		}
		
		else
		{
			
			h.put(ch, 1);
			
		}
		
		
		Set<Character> values = h.keySet();
		
		
		for(Character vv:values)
		
		{
			
			
			System.out.println(vv+":"+h.get(vv));
		}
		
		
		
		
	}
	
	
}
}
