package day7;

public class CommandDemo {
public static void main(String[] args) {
	Police police=new Police();
	FoodSafety food=new FoodSafety();
	Hospital hospital =new Hospital();
	Corporation corp=new Corporation();
	
	Command body=new Foreignbody(police,hospital,corp,food);
	Command safefood=new NewHotel(police, hospital, corp, food);
	
	ControlHub control=new ControlHub();
	control.setCommand(1, safefood);
	control.setCommand(2, body);
	control.commandExe(3);
}
}








class ControlHub{
	
Command c[]=new Command[5];
public ControlHub() {
	for(int i=0;i<=4;i++) {
		c[i]=new DummyCommand();
	}
}
public void setCommand(int i,Command command) {
	c[i]=command;
	
}
public void commandExe(int i) {
	
	c[i].execute();
	
}
	
	
class DummyCommand extends Command{

	@Override
	public void execute() {
		System.out.println("Dummy Command");
		
	}
	
}
}





abstract class Command{
	 Police police;
	 Hospital hospital;
	 Corporation corp;
	 FoodSafety food;
	public Command() {
		// TODO Auto-generated constructor stub
	}
	public Command(Police police,Hospital hospital,Corporation corp,FoodSafety food) {
		this.police=police;
		this.hospital=hospital;
		this.corp=corp;
		this.food=food;
	}
	
	public abstract void execute();
}

class Foreignbody extends Command {
	public Foreignbody(Police police,Hospital hospital,Corporation corp,FoodSafety food) {
super(police,hospital,corp,food);
	}
	@Override
	public void execute() {
		police.conductingspection();
		police.obtaininglic();
		corp.conductingspection();
		corp.obtaininglic();
		hospital.conductingspection();
		hospital.obtaininglic();
	}
}
class NewHotel extends Command {
	public NewHotel(Police police,Hospital hospital,Corporation corp,FoodSafety food) {
super(police,hospital,corp,food);
	}
	@Override
	public void execute() {
		food.conductingspection();
		police.conductingspection();
		police.obtaininglic();
		food.obtaininglic();
		
	}
}

class Police{
	public void conductingspection() {
		System.out.println("succesfully conducting investigation");
	}
	public void obtaininglic() {
		System.out.println("Successfully obtained Licence");
	}
}
class FoodSafety{
	public void conductingspection() {
		System.out.println("succesfully conducting food investigation");
	}
	public void obtaininglic() {
		System.out.println("Successfully obtained food Licence");
	}
	
}
class Hospital{
	public void conductingspection() {
		System.out.println("succesfully conducting body transport");
	}
	public void obtaininglic() {
		System.out.println("Successfully transpoted body");
	}
}
class Corporation{
	public void conductingspection() {
		System.out.println("succesfully conducting death investigation");
	}
	public void obtaininglic() {
		System.out.println("Successfully obtained death Licence");
	}
}
