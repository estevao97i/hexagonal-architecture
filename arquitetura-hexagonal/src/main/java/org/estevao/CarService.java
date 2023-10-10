package org.estevao;

import org.jmolecules.ddd.annotation.Service;

import java.util.List;

@Service
public class CarService {

    private final Garage garage;

    private final Detran detran;

    private final CarSell carSell;

    public CarService(Garage garage, Detran detran, CarSell carSell) {
        this.garage = garage;
        this.detran = detran;
        this.carSell = carSell;
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

    public void vistoria(Car car) {
    }

    public void mudar(CarSell.CarRequest car) {
        carSell.mudar(car); // quebra a regra de negocio para varias classe pra nao ficar um linguição aqui no service
    }

    public void modificarCarro(Car car) {
    }
}
