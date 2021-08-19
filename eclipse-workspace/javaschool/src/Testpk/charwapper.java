package Testpk;

//Java program to demonstrate Autoboxing

import java.util.ArrayList;

class charwapper {
	public static void main(String[] args) {
		char ch = 'a';

		// Autoboxing- primitive to Character object conversion
		Character a = ch;
		System.out.println(a);
		System.out.println(ch);

		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		// Autoboxing because ArrayList stores only objects
		arrayList.add(25);

		// printing the values from object
		System.out.println(arrayList.get(0));
		ArrayList<Integer> arraylist = new ArrayList<Integer>();

		arraylist.add(10);

		System.out.println(arraylist.get(0));
	}
}