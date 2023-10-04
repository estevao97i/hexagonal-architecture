package org.estevao;

import org.jmolecules.ddd.annotation.Entity;

import java.time.Year;

@Entity
public class Car {

    private String plate;
    private String model;
    private Year year;

}
