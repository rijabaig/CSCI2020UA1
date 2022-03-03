package csci2020;

//builder class
public interface carbuilder {
    cars build();

    carbuilder setColor(final String color);

    carbuilder setYear(final int year);

    carbuilder setVehicletype(final String vehicletype);

    carbuilder setFueltype(final String fueltype);

}