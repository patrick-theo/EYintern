package day1exec;

public class Sample22 {
	public static void main(String[] args) {
		
		Access acc=new Access();
		acc.nomo();
		acc.proc();
		acc.publ();
		
		
		
	}
}
 class Access{
	 private int pri;
	 protected int pro;
	 public int pub;
	 int nom;
	 @SuppressWarnings("unused")
	private void priv() {
		System.out.println("private");
	 }
	 public void nomo() {
	
		
	}
	protected void proc() {
		 System.out.println("private");
	 }
	 void nomo(){
		 System.out.println("private");
	 }
	 public void publ() {
		 System.out.println("private");
	 }
 }
