package com.company;

/** The Class defines ships
 *  by name and in which year it was built
 * */
public class Ship {
    //The ship's name
    protected String shipName;
    //The ship's built of year
    protected String shipBuiltOfYear;

/** Parameterized Constructor
 *  refer current class instance variables */
public Ship (String shipName, String shipBuiltOfYear) {
    this.shipName = shipName;
    this.shipBuiltOfYear = shipBuiltOfYear;
}

    /**
     The setShipName method sets the ship Name.
     @param shipName assigns the value of the parameter shipName to the field of the same name
     */
    public void setShipName (String shipName){
        this.shipName = shipName;
    }

    /** The shipBuiltOfYear method sets the build year of the ship
     * @param shipBuiltOfYear assigns the value of the parameter shipName to the field of the same name */
    public void setShipBuiltOfYear (String shipBuiltOfYear){
        this.shipBuiltOfYear = shipBuiltOfYear;
    }

    /** The getShipName method returns the name of the ship
     * @return The actual ship name */
    public String getShipName () {
        return shipName;
    }
    /** The getShipBuiltOfYear method returns the the year of building ship
     * @return shipBuiltOfYear The actual of year the ship when it was built */
    public String getShipBuiltOfYear () {
        return shipBuiltOfYear;
    }

    /** The toString method
     * @return The name and built year of the ship */
    public String toString () {
        return "The ship's name is: " + this.shipName
                + " and the ship's built of year is: " + this.shipBuiltOfYear;
    }
}
