package com.directi.training.srp.exercise.solution;

import java.util.List;

import com.directi.training.srp.exercise.Car;

public class CarService
{
    private final CarRepository _carRepository;

    public CarService(CarRepository carRepository)
    {
        _carRepository = carRepository;
    }

    public Car getBestCar()
    {
        List<Car> cars = _carRepository.getAllCars();
        Car bestCar = null;
        for (Car car : cars) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
