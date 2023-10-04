package org.estevao;

import java.util.List;

public class CarUI {

    private CarService service;

    public List<Car> listAll() {
        return service.listAll();
    }

    public void insert(Car car) {
        service.save(car);
    }

    public void delete(Car car) {
        service.delete(car);
    }
}
