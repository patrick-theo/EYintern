package day1exec;

public class Sample23 {
 protected static int a=1;
 public static void main(String[] args) {
	Child chi=new Child();
	chi.change();
	System.out.print(a);
}
}
class Child extends Sample23{
	void change() {
		a++;
	}
}
