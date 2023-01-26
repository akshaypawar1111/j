package a1;

import java.util.Scanner;

public class p1
{
public static void main(String[] args) {
	
	
  int a=370;
  int b=0;
  
  for(int i=a; i>0; i=i/10)
	  
  {
	  
	  int c=i%10;
	  
	  b=b+(c*c*c);
	  
  }
  
  
  if(b==a)
  {
	  
	  System.out.println("it is armstrong number");
  }

  else
  {
	  
	  System.out.println("not armstrong");
  }

}
}
