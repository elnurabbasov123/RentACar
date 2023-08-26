package enums;

public enum Menyu {
    EXIT(0),
    ORDER_CAR(1),
    SHOW_ORDERS(2),
    ADD_CAR(3),
    UNKNOWN;

    private int option;

    Menyu(){

    }

    Menyu(int option){
    this.option=option;
    }

    public int getOption() {
        return option;
    }

}
