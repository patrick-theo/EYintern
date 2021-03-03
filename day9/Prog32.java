package day9;

public class Prog32 {
	static boolean flag;
	public static void main(String[] args) {
		int a=8;
		
		for (int i = 2; i <= a / 2; ++i) {
		      
		      if (a % i == 0) {
		        flag = true;
		        break;
		      }
		    }
		if (!flag)
		      System.out.println(a + " is a prime number.");
		    else
		      System.out.println(a + " is not a prime number.");
		  }
}
