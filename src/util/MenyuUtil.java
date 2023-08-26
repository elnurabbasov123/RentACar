package util;

import data.Data;
import enums.Menyu;
import model.Customer;
import service.impl.CarServiceImpl;
import service.impl.CustomerServiceImpl;
import service.inter.CarService;
import service.inter.CustomerService;
import java.util.Scanner;

public class MenyuUtil {

    public static void showMenyu(){
        Menyu[] menus=Menyu.values();
        for (int i = 0; i < Menyu.values().length; i++) {
            if(menus[i]!=Menyu.UNKNOWN){
                System.out.println(i+"."+menus[i]);
            }
        }
    }

    public static void chooseMenyu() {
        CarService carService=new CarServiceImpl();
        CustomerService customerService=new CustomerServiceImpl();

        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("----Car Ordering System----");
            System.out.println("Entry menyu option : ");
            MenyuUtil.showMenyu();
            int option = sc.nextInt();

            switch (option) {
                case 0:
                    System.exit(0);
                    //EXIT
                    break;
                case 1:
                    //ORDER_CAR
                    fiellForm();
                    break;
                case 2:
                    //SHOW_ORDERS
                    customerService.showOrder();
                    break;
                case 3:
                    //ADD_CAR
                    carService.addCar();
                    break;
                default:
                    System.out.println("Please select correct option :");
                    chooseMenyu();
            }
        }


    }
    public static void fiellForm(){
        CustomerService customerService=new CustomerServiceImpl();
        CarServiceImpl carService=new CarServiceImpl();

        Customer customer=customerService.addCustomer();

        System.out.println(customer);

        for (int i = 0; i < Data.cars.size(); i++) {
           if(Data.cars.get(i).isStatus()==false){
               if(customer.getCarId()== Data.cars.get(i).getId()){
                   System.out.println(Data.cars.get(i));
                   Data.cars.get(i).setStatus(true);
               }
           }
        }
    }
}
