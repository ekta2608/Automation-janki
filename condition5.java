package com;

public class condition5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a=20,b=300,c=50,d=60;
      if(a>b && a>c && a>d)
      {
    	  System.out.println("A is max");
      }
      else if(b>a && b>c && b>d )
      {
    	  System.out.println(" Bis max");
      }
      else if(c>a && c>b && c>d )
      {
    	  System.out.println(" c is max");
      }
      else if(d>a && d>b && d>c )
      {
    	  System.out.println(" D is max");
      }
      
      else
      {
    	  System.out.println("you have take wrong input");
      }
	}
	

}


