package Assignment25OOPprogect;



public class  Truck extends Vehicle {
    private int numberOfAxles;


    public Truck(double distanceTraveled, int numberOfAxles) {
        super(distanceTraveled);
        this.numberOfAxles = numberOfAxles;
        calculateToll();

    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public void setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;

    }


    public String toString() {
        return "Truck             " + getDistanceTraveled() + "              " + "$" + this.getTollAmount();
    }


    @Override
    void calculateToll() {
        if (numberOfAxles == 4){
            setTollAmount(getDistanceTraveled() * 0.04);
        } if (numberOfAxles == 6) {
            setTollAmount(getDistanceTraveled() * 0.045);
        }if (numberOfAxles >= 8) {
            setTollAmount(getDistanceTraveled() * 0.048);


        }
    }
}



