public class TaxDefault implements TaxService {

    double taxRate = 0.3;

    @Override
    public double calculateTax(double amount) {
        return amount * taxRate;
    }
}
