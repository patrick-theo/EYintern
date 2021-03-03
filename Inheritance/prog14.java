package module2;

public class prog14 {
public static void main(String[] args) {
	Result re=new Result("patrick", 890, 45, 45, 10);
	re.calculate();
}
}
 class Student{
	String name;
	int rollno;
	
	
	
	
}

class Exam extends Student{
	
	int sub1;
	int sub2;
	int sub3;
	
}

class Result extends Exam{
	 public Result(String name,int rollno,int sub1,int sub2,int sub3) {
		this.name=name;
		this.rollno=rollno;
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
	 }
	
	int totalmark;
	
	public void calculate(){
		System.out.println(name+" "+rollno);
		System.out.println(totalmark=sub1+sub2+sub3); 
	}
}