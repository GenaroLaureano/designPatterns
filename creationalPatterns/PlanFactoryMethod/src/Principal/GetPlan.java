/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import ServiceImp.CommercialPlan;
import ServiceImp.DomesticPlan;
import ServiceImp.InstitutionalPlan;
import ServiceImp.NonePlan;
import service.Plan;

/**
 *
 * @author laure
 */
public class GetPlan {
    
    public Plan getPlan(String planType){
        if(planType == null){
            return new NonePlan();
        }
        
        if(planType.equalsIgnoreCase("DOMESTIC PLAN")){
            return new DomesticPlan();
        }else if(planType.equalsIgnoreCase("COMMERCIAL PLAN")){
            return new CommercialPlan();
        }else if(planType.equalsIgnoreCase("INSTITUTIONAL PLAN")){
            return new InstitutionalPlan();
        }
        
        return new NonePlan();
    }
}
