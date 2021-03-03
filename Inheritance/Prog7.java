package module2;

public class Prog7 {
	public static void main(String[] args) {
		FinalVar f = new FinalVar();
		f.change();
		f.disp();
	}
}

class FinalVar {
	final int val = 10;
	
	public void change() {
		// val = 15; // We cannot change the value of a final 
	}
	
	public void disp() {
		System.out.println(val);
	}
}
}
