package day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CollectionDemo4 {
public static void main(String[] args) {
	Map<MyKey, String> myMap=new TreeMap()<>((o1,o2)->{return o2.compareTo(o1);});
	MyKey key1=new MyKey("k1");
	MyKey key2=new MyKey("k2");
	MyKey key3=new MyKey("k3");
	
	myMap.put(key1,"Avan");
	myMap.put(key2,"Ivan");
	myMap.put(key3,"Nan");
	
	System.out.println(myMap.get(key3));
	
	Set<Map.Entry<MyKey,String>> set=myMap.entrySet();
	Iterator<Map.Entry<MyKey,String>> iter=set.iterator();
	while(iter.hasNext()) {
		System.out.println("iter "+iter.next());
	}
}
}

class MyKey implements Comparable<MyKey>{
	String key;
	public MyKey(String key) {
		this.key=key;
	}
	@Override
	public String toString() {
		
		return this.key;
	}
	@Override
	public int compareTo(MyKey o) {
		return this.key.compareTo(o.key);
	}
}