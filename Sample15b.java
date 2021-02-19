package day1exec;

public class Sample15b {
public static void main(String[] args) {
	int a= 646;
	NumberType numb=new NumberType();
	numb.arm(a);
	numb.pal(a);
	numb.per(a);
	
}
}
class NumberType{
static int temp;
static int rem;
static int res;
	public void arm(int num) {
		temp=num;
		while(num>0) {
			rem=num%10;
			num=num/10;
			res=res+(rem*rem*rem);
		}
		if(temp==res) {
			System.out.println("It is armstrong");
		}
		temp=rem=res=0;
	}
public void per(int num) {
	temp=1;
	   while(temp<=num/2)
	    {
	       if(num%temp==0)
	       {
		res+=temp;
	       }
	      temp++;
	    }
	   if(res==num) {
	   System.out.println("It is Perfect");
	   }
	   temp=0;
	}
public void pal(int num) {
	temp=num;    
	  while(num>0){    
	   rem=num%10;   
	   res=(res*10)+rem;    
	   num=num/10;    
	  }    
	  if(temp==res) {
		  System.out.println("It is pallindrome");
	  }
	  temp=rem=res=0;
	
}
}
