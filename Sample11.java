package day1exec;

public class Sample11 {
	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=4;i++) {
			for(int j=0;j<i;j++) {
				count++;
				System.out.print(count+" ");
			}
			System.out.println();
		}
		
	}
}
