package module2;

public class prog9 {

}

class A{
	public int a;
	protected int b;
	private int c;
	
	public void pub() {
		
	}
protected void pro() {
		
	}
private void pri() {
	
}
}
class B extends A{
	int arr=a;
	int brr=b;
	int crr=c;
	
	@Override
	public void pub() {
		// TODO Auto-generated method stub
		super.pub();
	}
	@Override
	protected void pro() {
		// TODO Auto-generated method stub
		super.pro();
	}
	pri()  //Can only override and see protected and public members and methods in child class
}