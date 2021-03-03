package day12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo {
public ThreadDemo() {
ExecutorService es=Executors.newFixedThreadPool(1);
es.execute(()->{
	System.out.println("Child thread");
});
}
public static void main(String[] args) throws InterruptedException {
	
	new ThreadDemo();
	for(int i=0;i<5;i++) {
		System.out.println(i);
		Thread.sleep(1000);
	}
}
}

