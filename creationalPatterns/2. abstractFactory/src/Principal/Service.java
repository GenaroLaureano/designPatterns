/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import car.Car;
import factories.ServiceFactory;
import motorcycle.Motorcycle;

/**
 *
 * @author laure
 */
public class Service {
    private Car car;
    private Motorcycle motorcycle;
    
    public  Service(ServiceFactory service){
        car = service.serviceCar();
        motorcycle = service.serviceMotorcycle();
    }
    
    public void giveServicio(){
        car.service();
        motorcycle.service();
    }
}
