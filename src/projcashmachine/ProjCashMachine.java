package projcashmachine;
/**
 *
 * @author Leonardo Moraes de Oliveira
 */
import java.util.Scanner;

public class ProjCashMachine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        CashMachine objCashMachine = new CashMachine();
        CashMachine cashM = objCashMachine;
        Byte op;

        do {
            System.out.print("================Cash Machine================\n\n"
                    + "Chose an option to get started:\n\n"
                    + "1 - Cash Out\n"
                    + "2 - Money Available to Cash out\n"
                    + "0 - Exit\n"
                    + "Option: ");
            op = input.nextByte();

            switch (op) {

                case 1:
                    cashM.operation = new MoneyService();

                    do {
                        System.out.print("================Services================\n\n"
                                + "Available notes / Amount:\n"
                                + cashM.toString() + "\n"
                                + "Insert a value to cash out: ");
                        cashM.operation.setValue(input.nextInt());

                        if (!cashM.operation.isValid(cashM.operation.getValue())) {

                            System.out.println("\n\nInvalid value, it must be multiple of 10\n");

                        }

                    } while (!cashM.operation.isValid(cashM.operation.getValue()));

                    cashM.decreaseNotes();

                    System.out.print("================Services================\n\n"
                            + cashM.operation.toString() + "\n");
                    break;

                case 2:
                    System.out.print("================Services================\n\n"
                            + "Available notes / Amount:\n"
                            + cashM.toString() + "\n");
                    break;

                case 0:
                    System.out.println("\n\nSystem Closed.\n");
                    break;

                default:
                    System.out.println("\n\nInvalid option, please try again\n");
            }

        } while (op != 0);
    }

}
