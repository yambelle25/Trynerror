public class CarUsage {

    private String model;
    private double consumption; // litres per 100km

    public String getModel (){
    return model;
   }
   public void setModel(String model){
    this.model=model;
}

    public double getConsumption (){
    return consumption;
}

    public void setConsumption(double consumption){
    this.consumption=consumption;
}

public static void main(String[] args) {
    CarUsage automobilCar = new CarUsage();
        automobilCar.setModel("toyota");
        automobilCar.setConsumption(7.8);

        System.out.println(automobilCar.getModel()+ " " + "is" + " "+ automobilCar.getConsumption()+" "+"is high consumption");
    }
}
