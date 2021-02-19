package day1exec;
import java.util.Arrays;
public class Sample8 {
	public static void main(String[] args) {
		int[] arr=new int[] {8,2,5,4,7};
		Searching sear=new Searching();
		sear.search(arr, 8);
	}
}
class Searching{
	public void search(int[] arr,int ele) {
		Arrays.sort(arr);
	   int ind=Arrays.binarySearch(arr, ele);
		System.out.println(ind);
	}
}