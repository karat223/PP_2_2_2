package web.servise;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiseImp implements CarServis {
    @Override
    public List<Car> carList(int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("KIA", "Venga", 2015));
        cars.add(new Car("Toyota", "Corolla", 2022));
        cars.add(new Car("BMV", "X5", 2000));
        cars.add(new Car("Hyundai", "Solaris", 2021));
        cars.add(new Car("Mazda", "6", 2021));
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
