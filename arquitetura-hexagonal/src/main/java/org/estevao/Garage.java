package org.estevao;

import org.jmolecules.ddd.annotation.Repository;

import java.util.List;

@Repository
public interface Garage {
    void save(Car car);

    void delete(Car car);

    List<Car> listAll();
}
