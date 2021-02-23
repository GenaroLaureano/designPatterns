/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import factories.ChevroletServiceFactory;
import factories.JeepServiceFactory;
import factories.ServiceFactory;

/**
 *
 * @author laure
 */
public class Principal {
    
    public static Service metodoX(String x){
        Service service = null;
        ServiceFactory brandService;
        String brand = x;
        
        if(brand.equalsIgnoreCase("JEEP")){
            brandService = new JeepServiceFactory();
            service = new Service(brandService);
//            service.giveServicio();
        }else if(brand.equalsIgnoreCase("CHEVROLET")){
            brandService = new ChevroletServiceFactory();
            service = new Service(brandService);
//            service.giveServicio();
        }
        
        return service;
    }
    public static void main(String[] args) {
        Service service = metodoX("Jeep");
        service.giveServicio();
        
    }
}
