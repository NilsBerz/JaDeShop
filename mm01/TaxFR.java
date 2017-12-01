public class TaxFR implements TaxService {

    double taxRate = 0.9;

    @Override
    public double calculateTax(double amount) {
        return amount * taxRate;
    }
}
