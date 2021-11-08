public class Diamond {
    private int diamondCarats;
    private double diamondValue;

    public void setCarats(int diaCarats) {
        diamondCarats = diaCarats;
    }

    public int getCarats() {         // Sets the rating (1-5, with 5 best)
        return (diamondCarats);
    }

    public void setValue(double diaValue) {                           // Prints name and rating on one line
        diamondValue = diaValue;
    }

    public double getValue() {         // Sets the rating (1-5, with 5 best)
        return (diamondValue);
    }
}
