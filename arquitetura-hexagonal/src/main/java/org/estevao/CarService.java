package org.estevao;

import org.jmolecules.ddd.annotation.Service;

import java.util.List;

@Service
public class CarService {

    private final Garage garage;

    private final Detran detran;

    public CarService(Garage garage, Detran detran) {
        this.garage = garage;
        this.detran = detran;
    }

    public List<Car> listAll() {
        return garage.listAll();
    }

    public void save(Car car) {
        garage.save(car);
    }

    public void delete(Car car) {
        garage.delete(car);
    }
}
