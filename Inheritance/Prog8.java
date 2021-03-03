package module2;

public class Prog8 {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		singleton.singletonMethod();
	}
}

class Singleton {
	
	private static Singleton singleton = new Singleton();
	
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		return singleton;
	}
	
	protected static void singletonMethod() {
		System.out.println("Singleton example program");
	}
}
}
