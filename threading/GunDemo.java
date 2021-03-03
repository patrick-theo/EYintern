package day12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GunDemo {
public static void main(String[] args) {
	ExecutorService es=Executors.newFixedThreadPool(2);
	Gun gunn=new Gun();
	es.execute(()->{
		for(int i=0;i<5;i++) {
			gunn.shootGun();		
		}
	
	});
	
	es.execute(()->{
		for(int i=0;i<5;i++) {
			gunn.FillGun();		
		}
	
	});
	es.shutdown();
}
}

class Gun{
	boolean flag;
	synchronized public void FillGun() {
		if(flag) {
		try {
			wait();
		}catch(Exception e) {}
		}
		System.out.println("Filling gun");
		flag=false;
		notify();
			
	}
	
	synchronized public void shootGun() {
		if(!flag) {
			try {
				wait();
				
			}catch(Exception e) {}
		}
		System.out.println("Shooting");
		flag=true;
		notify();
	}
}
