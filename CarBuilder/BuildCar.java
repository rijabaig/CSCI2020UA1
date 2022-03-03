package csci2020;

//main class
public class BuildCar {

    public static void main(final String[] arguments) {
        final carbuilder builder = new CarBuilderConc();

        final Director carDirector = new Director(builder);
        System.out.println("Here are the different cars: ");
        System.out.println(" ");
//calling different car types
        System.out.println(carDirector.constructSUV());
        System.out.println(" ");
        System.out.println(carDirector.constructCoupe());
        System.out.println(" ");
        System.out.println(carDirector.constructTruck());
        System.out.println(" ");
        System.out.println(carDirector.constructSedan());
    }
}
