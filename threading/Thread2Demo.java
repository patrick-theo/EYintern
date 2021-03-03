package day12;

public class Thread2Demo {
public static void main(String[] args) {
	System.out.println("Firstline");
	new Thread(()->{met();});
	System.out.println("Thirdline");
}
public static void met() {
	try {
		Thread.sleep(1000);
	}catch(Exception e) {};
	System.out.println("SecondLine");
}
}
