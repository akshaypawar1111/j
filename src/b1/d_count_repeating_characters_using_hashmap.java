package b1;

import java.util.HashMap;
import java.util.Set;

public class d_count_repeating_characters_using_hashmap
{
public static void main(String[] args)
{

	String a="abcaabccc";
	
	HashMap<Character, Integer> h=new HashMap<Character, Integer>();
	
	
	for(int i=0; i<=a.length()-1; i++)

	{
		
		 char cc = a.charAt(i);
		
		
		if(h.containsKey(cc))
		{
		
			h.put(cc, h.get(cc) +1);
			
		}
		else
		{
			
			h.put(cc, 1);
			
		}
		
		
		Set<Character> tt = h.keySet();
		
		
		
		for(Character kk:tt)
		{
			
			System.out.println(kk+":"+h.get(kk));
		}
		
		
		
		
		
		
	}
	
	
}
}
