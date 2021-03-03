package module3;

public class Prog4 {

}
interface Seller{
	
public void sellBook();
public void sellpen();
	
}	
interface Broker{
	public void transBook();
	public void transpen();
}
interface buyer{
	public void buyBook();
	public void buypen();
	
}
interface customer extends Broker,buyer,Seller{
	public void use();
}

class Usage implements customer  {
	 @Override
	public void buyBook() {
		// TODO Auto-generated method stub
		
	}@Override
	public void sellpen() {
		// TODO Auto-generated method stub
		
	}@Override
	public void transBook() {
		// TODO Auto-generated method stub
		
	}@Override
	public void use() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void transpen() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void buypen() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void sellBook() {
		// TODO Auto-generated method stub
		
	}
	
}