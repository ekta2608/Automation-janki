package com.oop;

 class Sum
 {
	 int x,y;
	 public Sum()
	 {
		 x=20;
		 y=10;
		 System.out.println("first sum is..."+(x+y));
	 }
	 public Sum(int a, int b) {
		 x=a;
		 y=b;
		 System.out.println("second sum is..."+(x+y));
	 }
 }



public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sum s1=new Sum();
		new Sum(55,67);

	}

}
