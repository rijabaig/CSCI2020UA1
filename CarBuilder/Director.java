package csci2020;
//director classs
public class Director {

    private carbuilder builder;

    public Director(final carbuilder builder) {
        this.builder = builder;
    }
// here we are setting different types of cars with specific functionalities
    public cars constructSUV() {
        return builder.setVehicletype("SUV")
                .setColor("Red")
                .setYear(2005)
                .setFueltype("Unleaded Gas")
                .build();
    }

    public cars constructSedan() {
        return builder.setVehicletype("Sedan")
                .setColor("Blue")
                .setYear(2010)
                .setFueltype("Regular Gas")
                .build();
    }

    public cars constructCoupe() {
        return builder.setVehicletype("Coupe")
                .setColor("Blue")
                .setYear(2022)
                .setFueltype("Premium Gas")
                .build();
    }

    public cars constructTruck() {
        return builder.setVehicletype("Truck")
                .setColor("Black")
                .setYear(2022)
                .setFueltype("Diesel")
                .build();
    }

}
