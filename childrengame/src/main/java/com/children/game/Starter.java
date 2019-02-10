package com.children.game;

public class Starter {
	public static void main(String args[]) {
		Starter starter = new Starter();
		int input = 1;

		if(input == 0)
			System.out.println("Cannot take factorial of 0");
		else{
			int result = starter.myFac(input);
			System.out.println(result);
		}
	}

	public int myFac(int n) {
		if(n == 1)
			return 1;

		return myFac(n-1) * n ;
	}
}
