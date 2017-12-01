package mm01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shop s = new Shop();
		s.addItem(new Item(2,"bla",9.4));
		TaxService tx = new TaxService();
		tx.addStateTax("FR", 0.1d);
		
		System.out.println(s.getAllItems(new Customer()).toString());

	}

}
