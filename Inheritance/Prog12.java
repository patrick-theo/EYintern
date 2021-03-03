package module2;

public class Prog12 {
	public static void main(String[] args) {
		Haaris haaris[] = new Haaris[3];
		haaris[0] = new HaarisInfotech();
		haaris[1] = new HaarisTechnologies();
		haaris[2] = new HaarisPharma();
		System.out.println("Number of Clients in Haaris Infotech: " + haaris[0].getClients());
		System.out.println("Number of Clients in Haaris Technologies: " + haaris[1].getClients());
		System.out.println("Number of Clients in Haaris Pharma: " + haaris[2].getClients());
	}
}

abstract class Haaris {
	public abstract int getClients();
}

class HaarisInfotech extends Haaris {

	@Override
	public int getClients() {
		// TODO Auto-generated method stub
		return 8;
	}
	
}

class HaarisTechnologies extends Haaris {

	@Override
	public int getClients() {
		// TODO Auto-generated method stub
		return 10;
	}

}

class HaarisPharma extends Haaris {

	@Override
	public int getClients() {
		// TODO Auto-generated method stub
		return 14;
	}
	
}