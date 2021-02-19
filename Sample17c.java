package day1exec;

public class Sample17c {
public static void main(String[] args) {
	/* Children c1=new Children(); Constructor undefined error */
	Children c1=new Children(5);
}
}
class Children{
	int a;
	Children(int a){
		this.a=a;
	}
}
