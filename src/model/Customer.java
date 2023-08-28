package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Customer {
    private String name;
    private String surname;
    private String fin;
    private String serialNumberPassword;
    private String birthdate;
    private int carId;

    public Customer(){

    }
    public Customer(String name, String surname, String fin, String serialNumberPassword, String birthdate, int carId) {
        this.name = name;
        this.surname = surname;
        this.fin = fin;
        this.serialNumberPassword = serialNumberPassword;
        this.birthdate = birthdate;
        this.carId = carId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public String getSerialNumberPassword() {
        return serialNumberPassword;
    }

    public void setSerialNumberPassword(String serialNumberPassword) {
        this.serialNumberPassword = serialNumberPassword;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", fin='" + fin + '\'' +
                ", serialNumberPassword='" + serialNumberPassword + '\'' +
                ", birthdate='" + birthdate + '\'' +
                '}';
    }
}
