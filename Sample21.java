package day1exec;

public class Sample21{
	public static void main(String[] args) {
		int year=2000;
		String month="feb";
		switch(month) {
		case "jan":
			System.out.println("31");
			break;
		case "feb":
			if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) {
				System.out.println("29");
				break;
			}
			System.out.println("28");
			break;
		case "mar":
			System.out.println("31");
			break;
		case "apr":
			System.out.println("30");
			break;
		case "may":
			System.out.println("31");
			break;
		case "jun":
			System.out.println("30");
			break;
		case "july":
			System.out.println("31");
			break;
		case "august":
			System.out.println("31");
			break;
		case "sept":
			System.out.println("30");
			break;
		case "oct":
			System.out.println("31");
			break;
		case "nov":
			System.out.println("30");
			break;
		case "dec":
			System.out.println("31");
			break;
		}
		
	}
	

}
