package day9;

public class Prog21 {
public static void main(String[] args) {
	boolean a=true;
	boolean b=true;
	boolean c=a|b;
	boolean d=a&b;
	boolean e=a^b;
	boolean f=(!a&b)|(a&!b);
	boolean g=!a;
	System.out.println(c+" "+d+" "+e+" "+f+" "+g); //true true false false false
}
}
