package co.jamesfl.apps.liestviewnopersonalizado;

import java.util.ArrayList;

/**
 * Created by android on 07/10/2017.
 */

public class Data {
    private static ArrayList<Car> cars = new ArrayList<>();

    public static ArrayList<Car> getCars(){ return cars;}
    public static void addCar(Car c){ cars.add(c);}
}
