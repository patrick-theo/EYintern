package day6;

import java.util.Scanner;

public class FanDemo {
	public static void main(String[] args) throws Exception {
		Fanstate fs=new FanContainer().getstate(args[0]);
		
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Enter to change state");
			sc.next();
			fs.changeSpeed();
		}
		
		
	}
	

}
class FanContainer{
	public static Fanstate getstate(String s) throws Exception {
		Fanstate fs=new Fanstate();
		State st=(State)Class.forName(s).newInstance();
		fs.state=st;
		return fs;
	}
}

class Fanstate{
	State state;
	public void changeSpeed() {
		state.changeState(this);
	}
}

abstract class State{
	public abstract void changeState(Fanstate fan);
}

class On extends State{
	@Override
	public void changeState(Fanstate fan) {
fan.state=new Medium();		
	}
}
class Medium extends State{
	@Override
	public void changeState(Fanstate fan) {
		fan.state=new High();		// TODO Auto-generated method stub
		
	}
}
class High extends State{
	@Override
	public void changeState(Fanstate fan) {
		// TODO Auto-generated method stub
		fan.state=new Off();
	}
}
class Off extends State{
	@Override
	public void changeState(Fanstate fan) {
	fan.state=new On();
		
	}
}