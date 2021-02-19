package day1exec;
import java.util.ArrayList;
import java.util.List;
public class Sample16 {
public static void main(String[] args) {
	int[] arr= {1,2,3,4,10,3,10,3,10,3};
	int element=3;
	List<Integer> ele = new ArrayList<>();
	Searched sear=new Searched();
	sear.met(arr,4,ele,element);
}
}
class Searched{
	static int count;
	public void met(int[]arrays,int ele,List<Integer>eley,int element)
	{
		for(int i=0;i<arrays.length;i++) {
			if(element==arrays[i]) {
				count++;
			eley.add(i);
			}
			
		}
		System.out.println(count+" "+eley);
	}
}