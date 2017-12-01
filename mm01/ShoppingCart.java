import java.util.ArrayList;

public class ShoppingCart {
	
	ArrayList<Item> orderItems = new ArrayList<Item>();
	
	/**
	 * Calculate total costs of items in the ShoppingCart - including taxes
	 * @param customer - customer in question 
	 * @return total costs
	 */
    public double calculateTotal(Customer customer)
    {
    	double total = 0;
    	for (Item item : orderItems) {
			total += item.cost * item.quantity;
		}

    	TaxService taxService = new TaxFactory().getTaxService(customer);
    	total += taxService.calculateTax(total);


        return total;
    }
    
    public void removeItem(Item item){
    	orderItems.remove(item);
    }
    
    public void addItem(Item item){
    	orderItems.add(item);
    }
    
    /**
     * On checkout, Pay method is called providing the method of paying (e.g. PayPal, MasterCard). Method uses corresponding services
     * to do money transaction from Customer's account to Companies account.  
     * @param customer - Customer in question
     * @param method - Paying method string
     */
    public void pay(Customer customer, String method){
    	
    	double amount = calculateTotal(customer);
    	
    	if(method.equalsIgnoreCase("PayPal")){
    		PayPalAccount acc = new PayPalAccount(customer);
    		String account = PayPalAccount.findAccount(new Customer());
    		acc.pay(amount, account);
    	} // TODO Add MasterCard and Visa services in the future

    }


}
