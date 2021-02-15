/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceImp;

import service.Plan;

/**
 *
 * @author laure
 */
public class DomesticPlan implements Plan {

    private double rate = 3.50; 
    

    @Override
    public void calculateBill(int units) {
        System.out.println("The mount of your bill is : " + (units * rate));
    }
    
}
