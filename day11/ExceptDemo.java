package day11;

import java.util.Scanner;


public class ExceptDemo {
public static void main(String[] args) throws Exception {
	Customer cus=new Customer();
	Waiter wai = new Waiter();
	Scanner sc=new Scanner(System.in);
	String Itemname=sc.next();
	Item item=(Item)Class.forName(Itemname).getConstructor().newInstance();
	cus.eatfood(wai, item);
}
}

abstract class Item{
	public abstract void execute() throws TasteException;
}

class Dosa extends Item{
public Dosa() {
	// TODO Auto-generated constructor stub
}
	@Override
	public void execute() throws TasteException {
throw new MediumTaste("Okay tasting...");		
	}
	
}
class Fries extends Item{
public Fries() {
	// TODO Auto-generated constructor stub
}
	@Override
	public void execute()throws TasteException {
		// TODO Auto-generated method stub
		throw new YummyTaste("Very good tasting");
	}
	
}
class Rice extends Item{
public Rice() {
	// TODO Auto-generated constructor stub
}
	@Override
	public void execute()throws TasteException {
		// TODO Auto-generated method stub
		throw new YuckTaste("Not good");
	}
	
}

abstract class TasteException extends Exception{
	public abstract void check();
}

class MediumTaste extends TasteException{
	String msg;
	public MediumTaste(String msg) {
	this.msg=msg;	
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.msg;
	}
	@Override
	public void check() {
new IndianTasteHandler().handle(this);		
	}
	
}
class YummyTaste extends TasteException{
	String msg;
	public YummyTaste(String msg) {
	this.msg=msg;	
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.msg;
	}
	@Override
	public void check() {
		new IndianTasteHandler().handle(this);		// TODO Auto-generated method stub
		
	}
}
class YuckTaste extends TasteException{
	String msg;
	public YuckTaste(String msg) {
	this.msg=msg;	
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.msg;
	}
	@Override
	public void check() {
		// TODO Auto-generated method stub
		new IndianTasteHandler().handle(this);
	}
}

class Customer{
	public void eatfood(Waiter wait,Item item) {
		try {
			wait.Serve(item);
		}catch(TasteException e) {
			System.out.println("Exception..."+e);
			e.check();
			
		}
	}
}
class Waiter{
 public void Serve(Item item) throws TasteException {
	item.execute(); 
 }
}


interface TasteHandler {
	public void handle(YummyTaste yt);
	public void handle(YuckTaste yut);
	public void handle(MediumTaste mt);
}

class IndianTasteHandler implements TasteHandler{

	@Override
	public void handle(YummyTaste yt) {
System.out.println("Enjoy");		
	}

	@Override
	public void handle(YuckTaste yut) {
	System.out.println("good for health");	// TODO Auto-generated method stub
		
	}

	@Override
	public void handle(MediumTaste mt) {
		System.out.println("Good ");		// TODO Auto-generated method stub
		
	}
	
	
	
	
}

