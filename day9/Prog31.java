package day9;

import java.util.Scanner;

public class Prog31 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String func=sc.nextLine();
	int a=10;
	int b=5;
	int c;
	switch(func) {
	case "add":
		c=a+b;
		System.out.println(c);
		break;
	case "sub":
		c=a-b;
		System.out.println(c);
		break;
	case "mul":
		c=a*b;
		System.out.println(c);
		break;
	case "div":
		c=a/b;
		System.out.println(c);
		break;
	}
	
}
}
