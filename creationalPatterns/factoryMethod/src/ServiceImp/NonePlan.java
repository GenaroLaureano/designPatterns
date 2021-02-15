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
public class NonePlan implements Plan{

    @Override
    public void calculateBill(int units) {
        System.err.println("The plan doesn't exist");
    }
    
}
