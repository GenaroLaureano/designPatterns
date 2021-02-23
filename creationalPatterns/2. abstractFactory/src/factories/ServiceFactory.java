/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories;

import car.Car;
import motorcycle.Motorcycle;

/**
 *
 * @author laure
 */
public interface ServiceFactory {
    Car serviceCar();
    Motorcycle serviceMotorcycle();
}
