package p1;

public class star5 
{
public static void main(String[] args)
{

	
	int space=0;
	int star=10;
	
	
	for(int i=1; i<=11; i++)
	{
		
		
		for(int j=1; j<=space; j++)
			
		{
			
			System.out.print(" ");
			
			
		}
		

		for(int j=1; j<=star; j++)
			
		{
			
			System.out.print("*");
			
			
		}
		System.out.println();
		star--;
		space=space+2;;
		
		
	}
	
	
	
	
	
}
}
