package day1exec;

public class Sample13 {
public static void main(String[] args) {
	int arr[][]= {{1,50},{2,60},{3,30},{4,40}};
	Result resu=new Result();
	resu.res(arr);
}
}
class Result{
	public void res(int[][]array) {
		for(int i=0;i<=3;i++) {
			for(int j=0;j<=1;j++) {
				if(j==1) {
					if(array[i][j]>=40) {
						System.out.println("student "+i+" Pass");
					}
					else {
						System.out.println("student "+i+" Fail");
					}
				}
			}
		}
	}
}
