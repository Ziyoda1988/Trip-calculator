package Assignment25OOPprogect;

public class PoliceCruiser extends Vehicle {
    public PoliceCruiser(double distanceTraveled) {
        super(distanceTraveled);
        calculateToll();
    }

    public String toString() {
        return "PoliceCruiser     " + getDistanceTraveled() + "              " + "$" + this.getTollAmount();
    }

    @Override
    void calculateToll() {
        setTollAmount(0.0);

    }
}

