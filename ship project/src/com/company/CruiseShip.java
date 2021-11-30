package com.company;

import java.io.LineNumberInputStream;
/** The class defines the maximum
 * passengers in the ship */
public class CruiseShip extends Ship {
    //The ship's maximum number of passengers
    protected int maxNumOfPassengers;

/** @param shipName calls the ship name
 * @param shipBuiltOfYear calls origin building year
 * @param maxNumOfPassengers calss the maximum passengers in the ship*/
    public CruiseShip(String shipName, String shipBuiltOfYear, int maxNumOfPassengers) {

        //Calls the superclass constructor
        super(shipName, shipBuiltOfYear);

        //the protected member
        //"maxNumOfPasssengers" and the parameter "maxNumOfPasssengers" passed into the constructor
        this.maxNumOfPassengers = maxNumOfPassengers;
    }

/** The setMaxNumOfPassengers method that defines maxNumOfPassengers*/
    public void setMaxNumOfPassengers(int maxNumOfPassengers) {
        this.maxNumOfPassengers = maxNumOfPassengers;
    }
/** The getMaxNumOfPassengers method
 * @return the maximum of person in the ship */
    public int getMaxNumOfPassengers() {
        return maxNumOfPassengers;
    }

    /** The toString method
     * @return The information about ship and how
     * many passengers located*/
    public String toString() {
        return  ("The ship's name is: "+this.shipName + ", " + "Max number of passenger in CruiseShip: "
                + maxNumOfPassengers );
    }
}