package mm01;

class StateTax{
    String StateCode = null;
    double StateTax = 0.0;

    public StateTax(String StateCode, double Tax){
        this.StateCode = StateCode;
        this.StateTax = Tax;
    }

    public double getStateTax(){
        return StateTax;
    }

    public String getStateCode(){
        return StateCode;
    }
}