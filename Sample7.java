package day1exec;
import java.util.Arrays;
public class Sample7 {
	public static void main(String[] args) {
		int[] arr=new int[] {8,2,5,4,7};
		Sorting sor=new Sorting();
		sor.ascending(arr);
		sor.descending(arr);
	}
}
class Sorting{
	public void ascending(int[] arras) {
		Arrays.sort(arras);
		for(int arra:arras) {
			System.out.print(arra+" ");
			
		}
		System.out.println();
	}
public void descending(int[] arrdes) {
	Arrays.sort(arrdes);
	for(int i=arrdes.length-1;i>=0;i--) {
		System.out.print(arrdes[i]+" ");
	}
	}
}
