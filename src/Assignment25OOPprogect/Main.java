package Assignment25OOPprogect;



import java.util.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("******************** TOLL ADMINISTRATION APPLICATION ********************");
        System.out.println("------------------------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many vehicels would you like to enter?");
        int numberOfVehicels = scanner.nextInt();
        scanner = new Scanner(System.in);

        ArrayList<Vehicle> arrayList = new ArrayList<>();
        for (int i = 0; i < numberOfVehicels; i++) {
            Vehicle vehicle  = null;

            System.out.println("Calculating toll for vehicle #" + (i + 1));
            System.out.println("Choose the vehicle type: " + "\n" + "1. Car" + "\n" + "2. Truck" + "\n" + "3. Police Cruiser");
            int vehicleType = scanner.nextInt();

            System.out.println("Distance traveled:");
            double distanceTraveled = scanner.nextDouble();

            if (vehicleType == 1) {

                System.out.println("Does it have a trailer? (True/False)");
                boolean hasTrailer = scanner.nextBoolean();

                System.out.println("Is Hov3+ on? (True/False)");
                boolean isHov3 = scanner.nextBoolean();

                vehicle = new Car(distanceTraveled, hasTrailer, isHov3);
                System.out.println("TOLL INFO:" + "\n" + "Vehicle:          " + "Distance          " + "Toll Amount");
                System.out.println("Car               " + distanceTraveled + "              " + new Car(distanceTraveled, hasTrailer, isHov3).getTollAmount());
                System.out.println("------------------------------------------------------------------------------");


            } else if (vehicleType == 2) {
                System.out.println("How many axles?");
                int numberOfAxles = scanner.nextInt();

                if (numberOfAxles != 4 && numberOfAxles != 6 && numberOfAxles != 8) {
                    System.out.println("Invalid number of axles. Please enter 4, 6, or 8.");
                    numberOfAxles = scanner.nextInt();


                }
                vehicle = new Truck(distanceTraveled, numberOfAxles);
                System.out.println("TOLL INFO:" + "\n" + "Vehicle:          " + "Distance          " + "Toll Amount");
                System.out.println("Truck             " + distanceTraveled + "              " + new Truck(distanceTraveled, numberOfAxles).getTollAmount());
                System.out.println("------------------------------------------------------------------------------");

            } else if (vehicleType == 3) {
                vehicle = new PoliceCruiser(distanceTraveled);
                System.out.println("TOLL INFO:" + "\n" + "Vehicle:          " + "Distance          " + "Toll Amount");
                System.out.println("Police Cruiser    " + distanceTraveled + "              " + new PoliceCruiser(distanceTraveled).getTollAmount());
                System.out.println("------------------------------------------------------------------------------");


            }

            arrayList.add(vehicle);

        }

        System.out.println("TOLL INFO FOR ALL VEHICLES: " + "\n" + "---------------------------------------------------");
        System.out.println("Vehicle:          " + "Distance          " + "Toll Amount");
        for (Vehicle vehicle : arrayList) {
            System.out.println(vehicle);
        }




        System.out.println("THANK YOU FOR USING THE TAA! GOODBYE!");
    }
}

