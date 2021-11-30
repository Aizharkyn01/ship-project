package com.company;

import java.util.ArrayList;
import java.util.List;

public class ShipArray {

    public static void main(String[] args) {
        // Create ArrayList for ships
        List<Ship> ships=new ArrayList<>();

        //Add name, year of built and cargo capacity of the ship
        ships.add(new Ship("Troya Ship", "2001"));

        ships.add(new CruiseShip("Italy Ship", "1988", 17));

        ships.add(new CargoShip("Maya Ship", "2010", 10));

        //Display the items in the shipList
        System.out.println("The Ships are coming here: ");
        ships.forEach(System.out::println);
        System.out.println(" ");

        //Student:Aizharkyn Nurlanova
        //ID:51661

    }
}
