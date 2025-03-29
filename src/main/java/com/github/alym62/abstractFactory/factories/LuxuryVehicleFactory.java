package com.github.alym62.abstractFactory.factories;

import com.github.alym62.abstractFactory.Car;
import com.github.alym62.abstractFactory.Motorcycle;
import com.github.alym62.abstractFactory.VehicleFactory;
import com.github.alym62.abstractFactory.luxury.CarLuxury;
import com.github.alym62.abstractFactory.luxury.MotorcycleLuxury;

public class LuxuryVehicleFactory implements VehicleFactory {
    @Override
    public Car createCar() {
        return new CarLuxury();
    }

    @Override
    public Motorcycle createMotorcycle() {
        return new MotorcycleLuxury();
    }
}
