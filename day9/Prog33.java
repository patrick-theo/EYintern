package day9;

import java.util.Scanner;

public class Prog33 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int range=sc.nextInt();
	for(int i=0;i<range;i++) {
		if(i%2==0) {
			System.out.println(i);
		}
	}
}
}
