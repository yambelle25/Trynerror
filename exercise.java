public class exercise {
    public static void main(String[] args) {
        // Create an array of Car objects
        String Car[][] cars = {
            {new Car("Sedan"), new Car("SUV"), new Car("Truck")},
            {new Car("Truck"), new Car("Sedan"), new Car("SUV")},
        };

        
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.println("Car Type: " + cars[i][j].getType() + ", Petrol Usage: " + cars[i][j].getPetrolUsage());
            }
            System.out.println();
        }
    }
}