package day1exec;


public class Sample25 {
	public static void main(String[] args) {
		/* Classes cant be protected or private unless ther are inner classes*/
	}
}
class Derived{
	public void useD() {
		Base base=new Base();
		System.out.print("base says"+z.met());
	}
}

	protected class Base{
		String met() {
			return "wow";
		}
	}

