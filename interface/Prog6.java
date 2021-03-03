package module3;

public class Prog6 {
	protected void vis() {
		System.out.println("Visible"); //not visible from another package
	}
}

class Hello extends Prog6{
	
	public void check() {
		vis(); //visible
	}
}