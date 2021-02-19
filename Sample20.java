package day1exec;

public class Sample20 {
	public static void main(String[] args) {
int arr[][]= {{1,6,3,10},{2,6,9,7},{18,55,13,76},{56,86,47,98}};
Big bi=new Big();
bi.largestInEachRow(arr, 4, 4);
	}
	
	
}

class Big {
	public void largestInEachRow(int array[][], int row, int col) {
		int largest=0;
		
		for(int i=0; i<row; i++) {
			 
			
			for(int j=0; j<col; j++) {
				largest=array[i][j];
				if(array[i][j] > largest) {
					largest = array[i][j];
				}
			}
			
			System.out.println("The largest elements in "+(i+1)+" is "+largest);
		}
	}
}
