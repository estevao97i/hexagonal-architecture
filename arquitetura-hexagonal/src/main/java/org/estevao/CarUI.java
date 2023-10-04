package org.estevao;

import java.util.List;

public class CarUI {

    public List<Car> listAll() {
        return Car.listAll();
    }

    public void insert(Car car) {
        car.insert();
    }

    public void delete(Car car) {
        car.delete();
    }
}
