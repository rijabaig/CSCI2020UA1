package csci2020;

//product class
public class cars {
    private int year;
    private String color;
    private String fueltype;
    private String vehicletype;

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(final int year) {
        this.year = year;
    }

    public String getFueltype() {
        return fueltype;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }

    public String getVehicletype() {
        return vehicletype;
    }

    public void setVehicletype(String vehicletype) {
        this.vehicletype = vehicletype;
    }

    @Override
    public String toString() {
        return "Car Info: [Year = " + year + ", color = " + color + ", vehicletype = " + vehicletype + ", fueltype = "
                + fueltype + "]";
    }
}