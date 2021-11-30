package com.company;

/** This class defines about
 * cargo capacity in tonnage */
public class CargoShip extends Ship {
    //The ship's cargo capacity
    protected int cargoCapacity;

/** Parameterized Constructor
 * @param shipName calls the naming of the ship
 * @param shipBuiltOfYear calls the year of building ship
 * @param cargoCapacity calls cargo of the ship*/
    public CargoShip(String shipName, String shipBuiltOfYear, int cargoCapacity) {

        //Calls the superclass constructor
        super(shipName,shipBuiltOfYear);

        //This passed into the constructor
        this.cargoCapacity = cargoCapacity;
    }

/** The setCargoCapacity method defines cargo's of the ship*/
    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
/** The getCargoCapacity method
 * @return the ship's cargoCapacity in tonnage */
    public int getCargoCapacity() {
        return cargoCapacity;
    }
/** The toString method
 * @return The information about the name and cargoCapacity of the ship*/
    public String toString() {
        return  ("The ship's name is: "+this.shipName + ", " + "The ship's cargoCapacity is: "
                + cargoCapacity + " in tonnage");
    }
}