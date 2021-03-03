package day9;

import java.util.Scanner;

public class Prog34 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	   int n=sc.nextInt(1);
	 int count = 0;
	   float sum = 0;
	   for (int i = 1; i <= n; i++) {
	      if(i%2 != 0) {
	         sum = sum + i;
	         count++;
	      }
	   }
	   float average = sum/count;
	   System.out.println(average);
	   
}
}
