package projcashmachine;

/**
 *
 * @author Leonardo Moraes de Oliveira
 */
public class CashMachine {

    // Attributes
    private int notesOf100;
    private int notesOf50;
    private int notesOf20;
    private int notesOf10;
    WithDraw operation;

    // Constructor
    public CashMachine() {
        WithDraw operation = new WithDraw();
        this.notesOf100 = 5;
        this.notesOf50 = 4;
        this.notesOf20 = 5;
        this.notesOf10 = 6;
    }

    // Getters and Setters
    public int getNotesOf100() {
        return notesOf100;
    }

    public void setNotesOf100(int notesOf100) {
        this.notesOf100 = notesOf100;
    }

    public int getNotesOf50() {
        return notesOf50;
    }

    public void setNotesOf50(int notesOf50) {
        this.notesOf50 = notesOf50;
    }

    public int getNotesOf20() {
        return notesOf20;
    }

    public void setNotesOf20(int notesOf20) {
        this.notesOf20 = notesOf20;
    }

    public int getNotesOf10() {
        return notesOf10;
    }

    public void setNotesOf10(int notesOf10) {
        this.notesOf10 = notesOf10;
    }

    public WithDraw getOperation() {
        return operation;
    }

    public void setOperation(WithDraw operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "\n"
                + "$100: " + this.notesOf100 + "\n"
                + "$50: " + this.notesOf50 + "\n"
                + "$20: " + this.notesOf20 + "\n"
                + "$10: " + this.notesOf10 + "\n"
                + "Total $" + this.getTotalOfMoney() + "\n";
    }

    // Special methods
    
    /* Count notes */
    public void calcNotes(int value) {

        if (this.notesOf100 < this.getAmount100Notes(value)) {

            this.operation.setN100(this.notesOf100);
            value -= (this.operation.getN100() * 100);
            this.notesOf100 -= this.operation.getN100();

        } else {
            this.operation.setN100(this.getAmount100Notes(value));
            value -= (this.operation.getN100() * 100);
            this.notesOf100 -= this.operation.getN100();
        }
        if (this.notesOf50 < this.getAmount50Notes(value)) {

            this.operation.setN50(this.notesOf50);
            value -= (this.operation.getN50() * 50);
            this.notesOf50 -= this.operation.getN50();

        } else {
            this.operation.setN50(this.getAmount50Notes(value));
            value -= (this.operation.getN50() * 50);
            this.notesOf50 -= this.operation.getN50();
        }
        if (this.notesOf20 < this.getAmount20Notes(value)) {

            this.operation.setN20(this.notesOf20);
            value -= (this.operation.getN20() * 20);
            this.notesOf20 -= this.operation.getN20();

        } else {
            this.operation.setN20(this.getAmount20Notes(value));
            value -= (this.operation.getN20() * 20);
            this.notesOf20 -= this.operation.getN20();
        }
        if (this.notesOf10 < this.getAmount10Notes(value)) {

            this.operation.setN10(this.notesOf10);
            value -= (this.operation.getN10() * 10);
            this.notesOf10 -= this.operation.getN10();

        } else {
            this.operation.setN10(this.getAmount10Notes(value));
            value -= (this.operation.getN10() * 10);
            this.notesOf10 -= this.operation.getN10();
        }

    }

    /* Return how many $100 notes will need */
    public int getAmount100Notes(int value) {
        if (value > 0) {
            return value / 100;
        } else {
            return 0;
        }

    }

    /* Return how many $50 notes will need */
    public int getAmount50Notes(int value) {
        if (value > 0) {
            return value / 50;
        } else {
            return 0;
        }
    }

    /* Return how many $20 notes will need */
    public int getAmount20Notes(int value) {
        if (value > 0) {
            return value / 20;
        } else {
            return 0;
        }
    }

    /* Return how many $10 notes will need */
    public int getAmount10Notes(int value) {
        if (value > 0) {
            return value / 10;
        } else {
            return 0;
        }
    }

    /* Test if the desired value is disible by 10 */
    public boolean isValid(int value) {
        if (value > 0) {
            return value % 10 == 0;
        } else {
            return false;
        }
    }

    /* Sum all notes to get a total cash value in ATM */
    public int getTotalOfMoney() {
        return (this.notesOf100 * 100)
                + (this.notesOf50 * 50)
                + (this.notesOf20 * 20)
                + (this.notesOf10 * 10);
    }

    /* Test if balance is positive */
    public boolean isBalancePositive(int value) {
        return this.getTotalOfMoney() >= value;
    }

}
