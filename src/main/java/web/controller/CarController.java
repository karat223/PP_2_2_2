package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.servise.CarServiseImp;

import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String Cars(@RequestParam(defaultValue = "5") int count, ModelMap model) {
        var carService = new CarServiseImp();
        try {
            List<Car> selCars = carService.carList(count);
            model.addAttribute("cars", selCars);
        } catch (IllegalArgumentException ignore) {
        }
        return "cars";
    }
}
