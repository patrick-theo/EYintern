package day11;

public class FourFive {
	public static void main(String[] args) throws Exception{
		
		FourFive s=new FourFive();
		try {
		s.met9(5);
		}catch (CustomExceptions e) {
			System.out.println("Exception "+e);
		}
	}
	public  void met9(int i) throws CustomExceptions {
		if(i==5) {
		throw new CustomExceptions("Error");
		}
	}
	}
	class CustomExceptions extends Exception{
		String message;
		public CustomExceptions(String message) {
			this.message=message;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.message;
		}
	}
