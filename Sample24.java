package day1exec;

public class Sample24 {
 public static void main(String[] args) {
	Quad q1=new Quad(2,5,7);
	System.out.print(q1.compute());
}
}
class Quad{
	int a;
	int b;
	int c;
	Quad(){
		a=1;
		b=1;
		c=1;	
	}
	Quad(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	int getvaluea(){
		return a;
	}
	int getvalueb(){
		return b;
	}
	int getvaluec(){
		return c;
	}
	void modify(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	String compute() {
		
		return(getvaluea()+"x^2+"+getvalueb()+"x+"+getvaluec());
	}
}
