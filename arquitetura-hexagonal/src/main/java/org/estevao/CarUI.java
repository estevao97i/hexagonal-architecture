package org.estevao;

import java.util.List;

public class CarUI {

    private Garage garage;

    public List<Car> listAll() {
        return garage.listAll();
    }

    public void insert(Car car) {
        garage.save(car);
    }

    public void delete(Car car) {
        garage.delete(car);
    }
}
