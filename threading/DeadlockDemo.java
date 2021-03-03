package day12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DeadlockDemo {
public static void main(String[] args) {
	ExecutorService esc=Executors.newFixedThreadPool(2);
	Frog frog=new Frog();
	Crane crane=new Crane();
	
	esc.execute(()->{
		crane.eartFood(frog);
	});
	esc.execute(()->{
		frog.escape(crane);
	});
	esc.shutdown();
}
}

class Crane{
	synchronized void eartFood(Frog frog) {
		frog.leaveCrane();
	}
	
	
	void spitfrog() {
		
	};
}

class Frog{
	synchronized void escape(Crane crane) {
		crane.spitfrog();
	}
	
	
	void leaveCrane() {
		
	}
}