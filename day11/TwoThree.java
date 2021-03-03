package day11;
public class TwoThree{
	public void meth1() {
	mth2();
	System.out.println("Caller");
		
	}
	public void mth2() {
		int i=5;
		int sum;
		try {
			sum=i/0;
			//return;
			System.exit(0);
		}catch(Exception e){
			System.out.println("catch mth2");
		}
		finally {
			System.out.println("finally-mth2");
		}
	}
	public static void main(String[] args) {
		TwoThree tw=new TwoThree();
		tw.meth1();
	}
	
}
/* 
 * 2)Without any exception it returns finally-meth2,caller
 *   By adding exception it returns catch mth2,finally mth2,caller
 * 3) it returns catch mth2,finally mth2,caller
 * 
 */
