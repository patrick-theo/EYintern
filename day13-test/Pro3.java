package day13_test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Pro3 {
		public static void main(String[] args) {
			Pro3 q3 = new Pro3();
			Pro3.before();
		}
		public static void before() {
			Set set = new TreeSet();
			set.add("2");
			set.add("3");
			set.add("1");
			Iterator it = set.iterator();
			while(it.hasNext()) {
				System.out.print(it.next() + " ");
			}
		}
	}

//PRints 1 2 3