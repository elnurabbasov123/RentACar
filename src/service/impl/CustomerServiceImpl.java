package service.impl;

import data.Data;
import model.Customer;
import service.inter.CustomerService;
import util.InputUtil;

import java.time.LocalDate;

public class CustomerServiceImpl implements CustomerService {
    CarServiceImpl carService=new CarServiceImpl();

    @Override
    public Customer fiellCustomer() {
        Customer customer=new Customer();
        String name = InputUtil.requiredText("Enter name :");
        customer.setName(name);
        String surname = InputUtil.requiredText("Enter surname :");
        customer.setSurname(surname);
        String fin = InputUtil.requiredText("Enter fin :");
        customer.setFin(fin);
        String serialNumberPassword = InputUtil.requiredText("Enter serialNumberPassword :");
        customer.setSerialNumberPassword(serialNumberPassword);
        LocalDate birthDate = LocalDate.parse(InputUtil.requiredText("Enter birthDate :"));
        customer.setBirthdate(birthDate);
        System.out.println("Choose the car :");
        carService.showNoOrderCarsAndPrint();
        boolean ok=true;
        while(ok){
            int carId = InputUtil.requiredNumber("Enter car id : ");
            for (int i = 0; i < carService.showNoOrderCars().size(); i++) {
                if(carService.showNoOrderCars().get(i).getId()!=carId){
                    System.out.println("Please Enter the correct car id  ");
                }else{
                    customer.setCarId(carId);
                    ok=false;
                }
            }
        }

        return customer;
    }

    @Override
    public Customer addCustomer() {
        Customer customer=fiellCustomer();
        Data.customers.add(customer);

        return customer;
    }

    @Override
    public void showOrder() {
        int k=1;
        for (int i = 0; i < Data.customers.size(); i++) {
            System.out.println("Customer "+k+++" .");
            System.out.println(Data.customers.get(i));
            int carId=Data.customers.get(i).getCarId();
            for (int j = 0; j < Data.cars.size(); j++) {
                if(carService.chooseCar().get(j).getId()==carId){
                    System.out.println(carService.chooseCar().get(j));
                }
            }
            System.out.println("-------------------------");
        }
    }
}
