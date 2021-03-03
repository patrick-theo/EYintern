package module2;

public class Prog6 {
	public static void main(String[] args) {
		
		StaticBlockTest s1 = new StaticBlockTest();
		StaticBlockTest s2 = new StaticBlockTest();
		s1.TestMethod();
		s2.TestMethod();
	}
}

class StaticBlockTest {
	// Static block
	static {
		System.out.println("Static block has been called.");
	}
	// Constructor
	public StaticBlockTest() {
		System.out.println("Constructor has been called.");
	}
	public static void TestMethod() {
		System.out.println("Instance method has been called.");
	}
}
}
