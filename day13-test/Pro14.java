package day13_test;

import java.util.ArrayList;
import java.util.List;

public class Pro14 {
	public static void main(String[] args) { 
		// INSERT DECLARATION HERE 
		for (int i = 0; i <= 10; i++) { 
		List<Integer> row = new ArrayList<Integer>(); 
		for (int j = 0; j <= 10; j++) 
		row.add(i * j); 
		table.add(row); 
		} 
		for (List<Integer> row : table) 
		System.out.println(row); 
		}
}
