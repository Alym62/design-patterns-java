package com.github.alym62.abstractFactory.factories;

import com.github.alym62.abstractFactory.Car;
import com.github.alym62.abstractFactory.Motorcycle;
import com.github.alym62.abstractFactory.VehicleFactory;
import com.github.alym62.abstractFactory.economy.CarEconomy;
import com.github.alym62.abstractFactory.economy.MotorcycleEconomy;

public class EconomyVehicleFactory implements VehicleFactory {
    @Override
    public Car createCar() {
        return new CarEconomy();
    }

    @Override
    public Motorcycle createMotorcycle() {
        return new MotorcycleEconomy();
    }
}
