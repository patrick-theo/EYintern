package day7;

public class hotelSarvanaDemo {
public static void main(String[] args) {
	Menu men=new Menu.MenuBuilder("Yes" , "Yes").setChutney("Yes").deliver();
System.out.println(men);
}
}

class Menu{
	private String idli;
	private String sambar;
	
	private String chutney;
	private String  podi;
	
	
	
	@Override
	public String toString() {
		return "Menu [idli=" + idli + ", sambar=" + sambar + ", chutney=" + chutney + ", podi=" + podi + "]";
	}
	
	public Menu(MenuBuilder builder) {
		this.idli=builder.getIdli();
		this.sambar=builder.getSambar();
		this.chutney=builder.getChutney();
		this.podi=builder.getPodi();
	}
	public static class MenuBuilder{
		private String idli;
		private String sambar;
		
		private String chutney;
		private String  podi;
		
		public MenuBuilder(String idli,String sambar) {
			this.idli=idli;
			this.sambar=sambar;
		}		
		public final String getIdli() {
			return idli;
		}
		public final void setIdli(String idli) {
			this.idli = idli;
		}
		public final String getSambar() {
			return sambar;
		}
		public final void setSambar(String sambar) {
			this.sambar = sambar;
		}
		public final String getChutney() {
			return chutney;
		}
		public final MenuBuilder setChutney(String chutney) {
			this.chutney = chutney;
			return this;
		}
		public final String getPodi() {
			return podi;
		}
		public final MenuBuilder setPodi(String podi) {
			this.podi = podi;
			return this;
		}
		public Menu deliver() {
			return new Menu(this);
		}
		
	}
}
