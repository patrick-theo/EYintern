package day1exec;

public class Sample5 {
	 int ave=0;
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,10};
		Average av=new Average();
		av.aver(arr);
		}
	
}
class Average{
	static int sum;
	static int avg;
public void aver(int[] numbers) {
		for(int number:numbers) {
			sum+=number;
		}
		avg=sum/numbers.length;
		System.out.println(avg);
	}
}
