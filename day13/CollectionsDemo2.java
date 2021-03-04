package day13;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class CollectionsDemo2 {
public static void main(String[] args) {
	Vector<String>v=new Vector<String>();
	v.add("Hello");
	v.add("Excuse me");
	Enumeration<String> e=v.elements();
	Iterator<String> iter=v.iterator();
	while(e.hasMoreElements()) {
		System.out.println("Enum "+ e.nextElement());
	}
	while(iter.hasNext()) {
		System.out.println("Iter "+ iter.next());
	}
}
}
