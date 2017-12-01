public class TaxDE implements TaxService {

    double taxRate = 0.8;

    @Override
    public double calculateTax(double amount) {
        return amount * taxRate;
    }
}
