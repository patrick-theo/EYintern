package module2;

public class Prog2 {
	double re, img;
	
	public Prog2(double re, double img) {
		this.re = re;
		this.img = img;
	}
	
	public static void main(String[] args) {
		Prog2 num1 = new Prog2(2.5, 3.2);
		Prog2 num2 = new Prog2(3.5, 4.6);
		Prog2 temp;
		
		temp = addComplex(num1, num2);
		
		System.out.printf("%.1f + %.1f", temp.re, temp.img);
	}
	
	public static Prog2 addComplex(Prog2 num1, Prog2 num2) {
		Prog2 temp = new Prog2(0.0, 0.0);
		temp.re = num1.re + num2.re;
		temp.img = num1.img + num2.img;
		
		return temp;
	}
}
