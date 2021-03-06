package day13_test;

import java.util.Arrays;
import java.util.Comparator;

public class Pro24 {
	public static void main(String[] args) {
		String[] s = {
			"map",
			"pen",
			"marble",
			"key"
		};
		Othello o = new Othello();
		Arrays.sort(s, o);
		for(String s2 : s) {
			System.out.print(s2 + " ");
		}
		System.out.println(Arrays.binarySearch(s, "map"));
	}
}

class Othello implements Comparator<String> {
	public int compare(String a, String b) {
		return b.compareTo(a);
	}
}
//option A