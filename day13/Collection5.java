package day13;

import java.util.Map;
import java.util.WeakHashMap;

public class Collection5 {
public static void main(String[] args) {
	Map<MyKey,String> myMap=new WeakHashMap<MyKey, String>();
	MyKey key1=new MyKey("k1");
	MyKey key2=new MyKey("k2");
	MyKey key3=new MyKey("k3");
	
	myMap.put(key1,"vanakam");
	myMap.put(key2,"hello");
	myMap.put(key3,"Salam");
	key1=null;
	System.out.println(myMap);
	System.gc();
	System.out.println(myMap);
}
}
