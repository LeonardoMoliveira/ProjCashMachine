package projcashmachine;
/**
 *
 * @author Leonardo Moraes de Oliveira
 */
public class MoneyService {

    // Attributes
    private int value;
    
    // Getters and Setters
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "\n"
                + "Value requested: " + this.value + "\n\n"
                + "Amount of 100 notes: " + this.getAmount100Notes(this.value) + "\n"
                + "Amount of 50 notes: " + this.getAmount50Notes(this.value) + "\n"
                + "Amount of 20 notes: " + this.getAmount20Notes(this.value) + "\n"
                + "Amount of 10 notes: " + this.getAmount10Notes(this.value) + "\n";
    }

    // Special Methods
    public int getAmount100Notes(int value) {
        return value / 100;
    }

    public int getAmount50Notes(int value) {
        return (value % 100) / 50;
    }

    public int getAmount20Notes(int value) {
        return ((value % 100) % 50) / 20;
    }

    public int getAmount10Notes(int value) {
        return (((value % 100) % 50) % 20) / 10;
    }
    
    public boolean isValid(int value) {
        return this.getAmount20Notes(value) % 10 == 0;
    }
}
