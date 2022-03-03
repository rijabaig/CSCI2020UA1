package csci2020;

//concrete builder
public class CarBuilderConc implements carbuilder {

    private cars car;

    public CarBuilderConc() {
        car = new cars();
    }

    public cars build() {
        return car;
    }
//setting color
    public carbuilder setColor(final String color) {
        car.setColor(color);
        return this;
    }
//setting year made
    public carbuilder setYear(final int year) {
        car.setYear(year);
        return this;
    }
//setting type of vehicle
    public carbuilder setVehicletype(final String vehicletype) {
        car.setVehicletype(vehicletype);
        return this;
    }
//sets fueltyype of car
    public carbuilder setFueltype(final String fueltype) {
        car.setFueltype(fueltype);
        return this;
    }

}
