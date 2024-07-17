package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class CarSeviceImpl implements CarService {

    List<Car> cars = new ArrayList<>();


    private void createCars() {
        cars.add(new Car("BMW", "Black", 3));
        cars.add(new Car("BMW", "White", 7));
        cars.add(new Car("BMW", "Black", 5));
        cars.add(new Car("Audi", "Red", 8));
        cars.add(new Car("Audi", "Purple", 8));
    }

    @Override
    public List<Car> getCars(int count) {
        createCars();
        if (count == 0 || count >= 5) {
            return cars;
        }
        return cars.stream().limit(count).toList();
    }
}
