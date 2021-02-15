package Principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import service.Plan;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laure
 */
public class GenerateBill {
    
    public static void main(String[] args) throws IOException{
        
        GetPlan planCast = new GetPlan();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the name of the contracted plan : ");
        String planName = br.readLine();
        
        System.out.println("Enter the units of consumed : ");
        int units = Integer.parseInt(br.readLine());
        
        Plan plan = planCast.getPlan(planName);
        plan.calculateBill(units);
        
    }
   
    
    
}
