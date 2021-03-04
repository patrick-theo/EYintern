package day13;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallDemo {
public static void main(String[] args) throws InterruptedException, ExecutionException {
	
	ExecutorService es=Executors.newFixedThreadPool(1);
	Future<String> future=es.submit(new Callsss());
	String s=future.get();
	System.out.println(s);
	es.shutdown();
}
}

class Callsss implements Callable<String>{

	@Override
	public String call() throws Exception {
		try {
			Thread.sleep(2000);
		}catch (Exception e) {
		}
		return "Hello Ulagam";
	}

}
