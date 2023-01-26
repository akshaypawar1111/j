package b1;

import java.util.HashMap;
import java.util.Set;

public class p1
{
public static void main(String[] args) {
	
	
	
	String a="akshaypawar";
	
	String b="";
	
	
	HashMap<Character, Integer> h = new HashMap<Character, Integer>();
	
	for(int i=0; i<=a.length()-1; i++)
	{
		
		char cc = a.charAt(i);
		
		if(h.containsKey(cc))
				{
			
			       h.put(cc, h.get(cc)+1);
			
				}
		else
		{
			
			h.put(cc,1);
		}
	
		
		Set<Character> zz = h.keySet();
		
		
		for(Character value:zz)
		{
			
			System.out.println(value+":"+h.get(value));
		}
		
		
		
		
	}
	
	
	
	
	
	
	
}
}
