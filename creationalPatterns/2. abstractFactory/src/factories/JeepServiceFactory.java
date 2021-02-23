/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories;

import car.Car;
import car.JeepCar;
import motorcycle.JeepMotorcycle;
import motorcycle.Motorcycle;

/**
 *
 * @author laure
 */
public class JeepServiceFactory implements ServiceFactory{

    @Override
    public Car serviceCar() {
        return new JeepCar();
    }

    @Override
    public Motorcycle serviceMotorcycle() {
        return new JeepMotorcycle();
    }
    
}
