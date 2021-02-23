/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories;

import car.Car;
import car.ChevroletCar;
import motorcycle.ChevroletMotorcycle;
import motorcycle.Motorcycle;

/**
 *
 * @author laure
 */
public class ChevroletServiceFactory implements ServiceFactory{

    @Override
    public Car serviceCar() {
        return new ChevroletCar();
    }

    @Override
    public Motorcycle serviceMotorcycle() {
        return new ChevroletMotorcycle();
    }
    
}
