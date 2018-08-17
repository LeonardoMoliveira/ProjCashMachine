package projcashmachine;

/**
 *
 * @author Leonardo Moraes de Oliveira
 */
import java.util.Scanner;

public class ProjCashMachine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        CashMachine atm = new CashMachine();
        Byte op;

        do {
            System.out.print("================Cash Machine================\n\n"
                    + "Chose an option to get started:\n\n"
                    + "1 - Withdraw\n"
                    + "2 - Money Available to Withdraw\n"
                    + "0 - Exit\n"
                    + "Option: ");
            op = input.nextByte();

            switch (op) {

                case 1:
                    atm.operation = new WithDraw();

                    do {
                        System.out.print("================Services====================\n\n"
                                + "Available notes / Amount:\n"
                                + atm.toString() + "\n"
                                + "Insert a value to withdraw: ");
                        atm.operation.setValue(input.nextInt());

                        if (!atm.isValid(atm.operation.getValue())) {

                            System.out.println("\n\nInvalid value, it must be multiple of 10\n");

                        }
                        if (!atm.isBalancePositive(atm.operation.getValue())) {

                            System.out.println("\n\nATM has no cash enough, please try again\n");

                        }

                    } while (!atm.isValid(atm.operation.getValue()) || !atm.isBalancePositive(atm.operation.getValue()));

                    atm.calcNotes(atm.operation.getValue());

                    System.out.print("================Services====================\n\n"
                            + atm.operation.toString() + "\n");
                    break;

                case 2:
                    System.out.print("================Services====================\n\n"
                            + "Available notes / Amount:\n"
                            + atm.toString() + "\n");
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
