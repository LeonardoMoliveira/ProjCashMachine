package projcashmachine;

/**
 *
 * @author Leonardo Moraes de Oliveira
 */
public class WithDraw {

    // Attributes
    private int value;
    private int n100;
    private int n50;
    private int n20;
    private int n10;

    // Getters and Setters
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getN100() {
        return n100;
    }

    public void setN100(int n100) {
        this.n100 = n100;
    }

    public int getN50() {
        return n50;
    }

    public void setN50(int n50) {
        this.n50 = n50;
    }

    public int getN20() {
        return n20;
    }

    public void setN20(int n20) {
        this.n20 = n20;
    }

    public int getN10() {
        return n10;
    }

    public void setN10(int n10) {
        this.n10 = n10;
    }

    @Override
    public String toString() {
        return "\n"
                + "Value requested: " + this.value + "\n\n"
                + "Amount of 100 notes: " + this.n100 + "\n"
                + "Amount of 50 notes: " + this.n50 + "\n"
                + "Amount of 20 notes: " + this.n20 + "\n"
                + "Amount of 10 notes: " + this.n10 + "\n\n"
                + "Confirm value: $" + this.getWithDrawTotal() + "\n";
    }

    // Special Methods
    public int getWithDrawTotal() {
        return (this.n100 * 100)
                + (this.n50 * 50)
                + (this.n20 * 20)
                + (this.n10 * 10);
    }

}
