package day6;

import java.util.Scanner;
public class DoggyDemo {
	public static void main(String[] args) throws Exception {
		
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a item...:");
		String item=scan.next();
		item="day6."+item;
		Useweapon use=new Container().doAction(item);
		use.getHit();
	}
}

class Container{
	public Useweapon doAction(String s) throws Exception{
		Useweapon uw=new Useweapon();
		Weapon weapon=(Weapon)Class.forName(s).newInstance();
		uw.weapon=weapon;
		return uw;
	}
}

class NaughtyChild{
	public void playWithDog(BullDog dog,String item) {
		
	}
}

class Useweapon{
	Weapon weapon;
	public void getHit(){
		weapon.gethitting(this);
	}
}

abstract class Weapon{
	public abstract void gethitting(Useweapon use);
	
}

class Stick extends Weapon{

	@Override
	public void gethitting(Useweapon use) {
		System.out.println("you beat I bite......");
		
	}
	
}
class Stone extends Weapon{

	@Override
	public void gethitting(Useweapon use) {
System.out.println("you hit I bark.....");		
	}
	
}

















