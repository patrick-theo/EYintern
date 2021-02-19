package day1exec;

public class Sample19 {
	public static void main(String[] args) {
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
						
	
		
		Rev revv = new Rev();
		revv.reverseele(arr, 3, 3);
		
	}
}

class Rev {
	void reverseele(int array[][], int row, int col) {
		int first;
		int last;
		int temp;
		
		for(int i=0; i<row; i++) {
			first = 0;
			last = col-1;
			while(first<last) {
				temp = array[i][first];
				array[i][first] = array[i][last];
				array[i][last] = temp;
				first++;
				last--;
			}
		}
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}

}
