package day6;
import java.util.Scanner;
public class Doggydemo2 {
	public static void main(String[] args) {
		BullDog1 tiger=new BullDog1();
		NaughtyChild1 baby=new NaughtyChild1();
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a item...:");
		String item=scan.next();
		baby.playWithDog(tiger, item);
	}
}
class BullDog1{
	public void play(String item) {
		if(item.equals("stick")) {
			System.out.println("you beat I bite......");
		}
		else if(item.equals("stone")) {
			System.out.println("you hit I bark.....");
		}
	}
}
class NaughtyChild1{
	public void playWithDog(BullDog1 dog,String item) {
		dog.play(item);
	}
}






















