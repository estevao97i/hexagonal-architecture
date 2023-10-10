package org.estevao.jsf;

import org.estevao.CarService;

public class CarGrpc {

    private final CarService service;

    public CarGrpc(CarService service) {
        this.service = service;
    }
}
