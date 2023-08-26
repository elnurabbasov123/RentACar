package service.impl;

import data.Data;
import model.Car;
import service.inter.CarService;
import util.InputUtil;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {

    static  int id=1;

    @Override
    public Car fiellCar() {
        Car car1=new Car();
        String brand=InputUtil.requiredText("Enter the brand :");
        car1.setBrand(brand);
        String model= InputUtil.requiredText("Enter the model :");
        car1.setModel(model);
        String bodyType=InputUtil.requiredText("Enter Body Type :");
        car1.setBodyType(bodyType);
        int doors=InputUtil.requiredNumber("Enter doors count :");
        car1.setDoors(doors);
        String engine=InputUtil.requiredText("Enter car engine :");
        car1.setEngine(engine);
        String rentAmount=InputUtil.requiredText("Enter rent amount :");
        car1.setRentAmount(rentAmount);
        String speed=InputUtil.requiredText("Enter car speed :");
        car1.setSpeed(speed);
        int seats=InputUtil.requiredNumber("Enter car seats :");
        car1.setSeats(seats);
        car1.setId(id++);

        return car1;
    }

    @Override
    public void addCar() {
        Car car1=fiellCar();
        Data.cars.add(car1);
    }

    @Override
    public List<Car> showNoOrderCarsAndPrint() {
        List<Car> cars=new ArrayList<>();
        for (int i = 0; i < Data.cars.size(); i++) {
            if(Data.cars.get(i).isStatus()==false){
                System.out.println(Data.cars.get(i));
            }
            cars.add(Data.cars.get(i));
        }
        return cars;
    }

    @Override
    public List<Car> showNoOrderCars() {
        List<Car> cars=new ArrayList<>();
        for (int i = 0; i < Data.cars.size(); i++) {
            if(Data.cars.get(i).isStatus()==false){
                cars.add(Data.cars.get(i));
            }

        }
        return cars;
    }

    @Override
    public List<Car> chooseCar() {
        int k=1;
        List<Car> cars=new ArrayList<>();
        for (int i = 0; i < Data.cars.size(); i++) {
             cars.add(Data.cars.get(i));
        }
        return cars;
    }

    @Override
    public void showCars() {
        int k=1;
        List<Car> cars=new ArrayList<>();
        for (int i = 0; i < Data.cars.size(); i++) {
            System.out.println(k+++"."+Data.cars.get(i));
            cars.add(Data.cars.get(i));
        }
    }
}

