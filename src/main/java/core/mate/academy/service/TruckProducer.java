package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck("DAF", "yellow", 10));
        trucks.add(new Truck("Mercedes", "red", 15));
        trucks.add(new Truck("Volvo", "grey", 20));
        return trucks;
    }
}