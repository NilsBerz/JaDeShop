

class StateTax{
    String StateCode = null;
    double Tax = 0.0;

    public StateTax(String StateCode, double Tax){
        this.StateCode = StateCode;
        this.Tax = Tax;
    }

    public double getTax(){
        return Tax;
    }
}