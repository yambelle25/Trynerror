class Car {
    private String model;
    private double consumption; // litres per 100km

    public Car(String model, double consumption) {
        this.model = model;
        this.consumption = consumption;
    }

    public String getModel() {
        return model;
    }

    public double getConsumption() {
        return consumption;
    }

    public String evaluateUsage() {
        if (consumption > 7) {
            return "High petrol usage";
        } else {
            return "Not much petrol usage";
        }
    }
}

public class PetrolUsage {
    public static void main(String[] args) {
        Car[] cars = {
            new Car("Toyota Hilux", 7),
            new Car("Honda Civic", 6.5),
            new Car("Ford Ranger", 8)
        };

        for (Car car : cars) {
            System.out.println(car.getModel() + ", consumption: " + car.getConsumption() + " litres - " + car.evaluateUsage());
        }
    }
}