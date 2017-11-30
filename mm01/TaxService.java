import java.util.ArrayList;

class TaxService {
    ArrayList<StateTax> StateTaxes = new ArrayList<StateTax>();
    
    TaxService(){
    }

    ArrayList<StateTax> getStateTaxes(){
        return StateTaxes;
    }
}