package day9;

import java.util.Scanner;

public class Prog36 {

	 public static void main(String args[]){  
		  int r,sum=0,temp;    
		  Scanner sc=new Scanner(System.in) ;
		  int num=sc.nextInt();
		  
		  temp=num;    
		  while(num>0){    
		   r=num%10;  
		   sum=(sum*10)+r;    
		   num=num/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
}
