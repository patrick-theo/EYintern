package module2;

public class prog11 {
public static void main(String[] args) {
	CaC cee=new CaC();
}
}
class CaA{
	public CaA(int i) {
System.out.println("Value is "+i);		
		
	}
}
class CaB{
	public CaB(int i) {
		System.out.println("Value is "+i);		// TODO Auto-generated constructor stub
	}
}
class CaC extends CaA{

	public CaC() {
		super(5);
		CaB bee=new CaB(10);
	}

	
}