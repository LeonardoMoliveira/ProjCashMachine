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
    MoneyService operation;

    // Constructor
    public CashMachine() {
        MoneyService operation = new MoneyService();
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

    public MoneyService getOperation() {
        return operation;
    }

    public void setOperation(MoneyService operation) {
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
    public void decreaseNotes() {
        this.notesOf100 -= this.operation.getAmount100Notes(this.operation.getValue());
        this.notesOf50 -= this.operation.getAmount50Notes(this.operation.getValue());
        this.notesOf20 -= this.operation.getAmount20Notes(this.operation.getValue());
        this.notesOf10 -= this.operation.getAmount10Notes(this.operation.getValue());
    }

    public int getTotalOfMoney() {
        return this.notesOf100
                + this.notesOf50
                + this.notesOf20
                + this.notesOf10;
    }

}
