package ver2_lec01;

public class MainMethod {

	public static void main(String[] args) {

			CocaCola coca = new CocaCola();		
			coca.showColaName("코카콜라");
			coca.showColaProperty();
			coca.whereIsCocaCola();

			PepsiCola pepsi = new PepsiCola();
			pepsi.showColaName("펩시콜라");
			pepsi.showColaProperty();
			pepsi.whereIsPepsiCola();
	}

}
