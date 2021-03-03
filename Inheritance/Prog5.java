package module2;

public class Prog5 {
	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		System.out.println(Test.objectCount);
		Test t3 = new Test();
		System.out.println(Test.objectCount);
	}
}

class Test {
	static int objectCount = 0;
	
	{ objectCount++; }
	
	Test() {}
	Test(int i) {}
	Test(char c) {}
}
}
