package module2;

public class prog15 {
	public static void main(String[] args) {
		House hs=new House();
		Door doo=new Door();
		Window win=new Window();
		int doorCost=doo.calc(hs.door);
		int WindowCost=win.calc(hs.window);
		System.out.println("windown "+ WindowCost);
		System.out.println("door "+doorCost);
		System.out.println("total:" + (WindowCost+doorCost));
	}
}
class House{
	int door=3;
	int window=8;
}

class Door extends House{
	public int calc(int doo) {
		return doo*10;
	}
}
class Window extends House{
	public int calc(int win) {
		return win*5;
	}
}

