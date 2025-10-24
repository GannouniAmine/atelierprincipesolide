package com.directi.training.srp.exercise.solution;

import java.util.List;

import com.directi.training.srp.exercise.Car;

public class CarService
{
	private CarRepository _repository;
    private CarFormatter _formatter;

    public CarService()
    {
        _repository = new CarRepository();
        _formatter = new CarFormatter();
    }

    public Car getBestCar()
    {
        List<Car> cars = _repository.findAll();
        Car bestCar = null;
        for (Car car : cars) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }

    public String getCarsNames()
    {
        List<Car> cars = _repository.findAll();
        return _formatter.formatCarNames(cars);
    }
}
