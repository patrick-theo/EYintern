package day13;

import java.util.ArrayList;

public class Generics2 {
public static void main(String[] args) {
	ArrayList<String> arraylist=new ArrayList<String>();
	arraylist.add("add");
	//arraylist.add(1);
for(int i=0;i<arraylist.size();i++) {
	String s=(String)arraylist.get(i);
	System.out.println(s);
}
}

}
