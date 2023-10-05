package org.estevao.jsf;

import org.estevao.Car;
import org.estevao.CarService;

import java.util.List;

public class CarController {

    private final CarService service;

    public CarController(CarService service) {
        this.service = service;
    }

    public List<Car> listAll() {
        return service.listAll();
    }

    public void insert(Car car) {
        service.save(car);
    }

    public void delete(Car car) {
        service.delete(car);
    }

    public void vistoria(Car car) {
        service.vistoria(car);
    }

    public void mudarDeDono(Car car) {
        service.mudar(car);
    }

    public void modificarCarro(Car car) {
        service.modificarCarro(car);
    }
}
