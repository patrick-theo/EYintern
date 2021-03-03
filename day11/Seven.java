package day11;

import java.util.Scanner;

public class Seven {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String num, den;
		int result=0;
		while(true) {
			System.out.println("Enter numerator: ");
			num = scan.next();
			if(num.charAt(0) == 'q' || num.charAt(0) == 'Q') {
				break;
			}
			System.out.println("Enter denominator: ");
			den = scan.next();
			try {
				result = Integer.parseInt(num) / Integer.parseInt(den);
			}
			catch(Exception e) {
				System.out.println("Exited.");
				System.out.println(e);
			}
			System.out.println(num + " / " + den + " = " + result);
		}
	}
	}
	

