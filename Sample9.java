package day1exec;

public class Sample9 {
	public static void main(String[] args) {
		int[]arr= {2,5,1,6,5};
		Reverse revv=new Reverse();
		revv.reverse(arr);
	}

}
class Reverse{
	
	public void reverse(int[] arrays) {
		int n=arrays.length;
		for(int i=n-1;i>=0;i--) {
			System.out.print(arrays[i]+" ");
		}
	}
}
