package mm01;

import java.util.ArrayList;
import java.util.Iterator;


class TaxService {
    ArrayList<StateTax> stateTaxes = new ArrayList<StateTax>();
    
    TaxService(){
    }

    public void addStateTax(String stateCode, double stateTax){
        stateTaxes.add(new StateTax(stateCode, stateTax));
    }

    ArrayList<StateTax> getStateTaxes(){
        return stateTaxes;
    }

    public double getStateTax(String stateCode){
        for(int i =0; i<stateTaxes.size();i++){
            if (stateTaxes.get(i).getStateCode() == stateCode){
                return stateTaxes.get(i).getStateTax();
            }
        }
        return 0d;
    }
}