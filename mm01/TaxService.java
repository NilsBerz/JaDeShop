import java.util.ArrayList;
import java.util.Iterator;


class TaxService {
    ArrayList<StateTax> StateTaxes = new ArrayList<StateTax>();
    
    TaxService(){
    }

    ArrayList<StateTax> getStateTaxes(){
        return StateTaxes;
    }

    public double getStateTax(String stateCode){
        for(int i =0; i<StateTaxes.size();i++){
            if (StateTaxes.get(i).getStateCode() == stateCode){
                return StateTaxes.get(i).getStateTax();
            }
        }
        return 0d;
    }
}