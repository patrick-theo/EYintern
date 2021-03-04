package day13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo3 {
public static void main(String[] args) {
	Set<String> mySett=new TreeSet<String>((o1,o2)->{return o2.compareTo(o1);}); //HashSet<String>();
	
	mySett.add("Hellow");
	mySett.add("Vanakam");
	mySett.add("Dhanyavadh");
	Iterator<String> iter=mySett.iterator();
	while(iter.hasNext()) {
		System.out.println("Iter "+iter.next());
	}
}
}
