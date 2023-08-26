package service.inter;

import model.Car;

import java.util.List;

public interface CarService {
    Car fiellCar();
    void  addCar();
    List<Car> chooseCar();
    void showCars();
    List<Car> showNoOrderCars();
    List<Car> showNoOrderCarsAndPrint();
}
