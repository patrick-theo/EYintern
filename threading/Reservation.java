package day12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Reservation {
public static void main(String[] args) {
	ReservationTicket res=new ReservationTicket();
	ExecutorService es=Executors.newFixedThreadPool(2);
	es.execute(()->{
		Thread.currentThread().setName("Killer");
		synchronized (res) {
			res.bookTicket(1000);
			res.giveChange();	
		}
		
		
		
	});
	es.execute(()->{
		Thread.currentThread().setName("GoldenWind");
		synchronized (res) {
			res.bookTicket(600);
			res.giveChange();	
		}
		
		
	});
	es.shutdown();
}
}
class ReservationTicket{
	int amt;
	public void bookTicket(int amount) {
		Thread t=Thread.currentThread();
		String name=t.getName();
		this.amt=amount;
		System.out.println("Ticket Booked by "+name+" for "+amt);
	}
	public void giveChange() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("Change given to "+name+" is"+ (amt-100));
	}
	
}