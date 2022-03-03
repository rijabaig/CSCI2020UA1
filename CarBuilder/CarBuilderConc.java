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

    public carbuilder setColor(final String color) {
        car.setColor(color);
        return this;
    }

    public carbuilder setYear(final int year) {
        car.setYear(year);
        return this;
    }

    public carbuilder setVehicletype(final String vehicletype) {
        car.setVehicletype(vehicletype);
        return this;
    }

    public carbuilder setFueltype(final String fueltype) {
        car.setFueltype(fueltype);
        return this;
    }

}