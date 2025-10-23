package com.directi.training.srp.exercise.solution;

import java.util.List;

import com.directi.training.srp.exercise.Car;

public class CarFormatter
{
    public String formatCarList(List<Car> cars)
    {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(car.getBrand()).append(" ").append(car.getModel()).append(", ");
        }
        return sb.length() > 0 ? sb.substring(0, sb.length() - 2) : "";
    }
}
