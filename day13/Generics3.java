package day13;

public class Generics3 {
public <E> E getObjects(E[] elements) {
	for(E element:elements) {
		System.out.println(element);
	}
	return null;
}
public static void main(String[] args) {
	Generics3 gen=new Generics3();
	gen.getObjects(new String[] {"a","b","c"});
	gen.getObjects(new Integer[] {1,2,3});
	
}
}
