package com.children.game;

import java.util.ArrayList;

public class ChildrenGame {
	public static void main(String args[]) {

		int n = 10;
		int k = 2;

		ArrayList<String> children = new ArrayList<String>();

		for(int i=1; i< (n+1); i++) {
			children.add("Child"+i);
		}

		//children.forEach(child -> System.out.println(child));

		ChildrenGame childrenGame = new ChildrenGame();

		childrenGame.removeKChild(children);



	}

	public void removeKChild(ArrayList<String> children) {
		ArrayList<String> originalList = children;
		ArrayList<String> newList = children;
		
		
		int k=3;
		int i = 0;

		for(int j=0; j < originalList.size(); j++)
		{
			i = i +1;
			System.out.println("Shout "+i);

			if(i==k) {
				System.out.println("Before: "+newList);
				System.out.println("Removing: "+newList.remove(j));
				//i=0;
				System.out.println("A"
						+ "fter: "+newList);
				//j = j -1;
			}
			
			if(j == (originalList.size() - 1)) {
				System.out.println(originalList.size());
				originalList = newList;
			}
		}
	}

	public void removeKChild1(ArrayList<String> children) {
		int k=3;
		int i = 0;

		do {
			
			for(int j=0; j < children.size(); j++) {
				i++;

				if(i==k) {
					System.out.println("Removing: "+children.remove(j));
					System.out.println(children);
					i=0;
				}	
			}
		}while(children.size() == 1);
	}
}
