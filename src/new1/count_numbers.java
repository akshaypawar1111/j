package new1;

public class count_numbers
{

	public static void main(String[] args) {
		
		
		
		String a = "aaaaaaaaaaaaaaaabbbcccccddddddddd";
		
		String b="";
		
		
		int totallength = a.length();
		
		
		int removedlength = a.replaceAll("a", "").length();
		
		
		
		System.out.println("number of occurance of A:"+(totallength-removedlength));
		
		

		
		
		
		
		
		
		
		
	}
}
