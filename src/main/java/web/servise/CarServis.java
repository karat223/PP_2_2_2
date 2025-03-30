package web.servise;

import web.model.Car;

import java.util.List;

public interface CarServis {
    List<Car> carList(int count);
}
