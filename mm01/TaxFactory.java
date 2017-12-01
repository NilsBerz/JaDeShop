public class TaxFactory {

    public TaxFactory() {
    }

    public TaxService getTaxService(Customer customer) {
        switch (customer.getStateCode()) {
            case "FR":
                return new TaxFR();
            case "DE":
                return new TaxDE();
            default:
                return new TaxDefault();
        }
    }
}
