import java.util.Scanner;

public class Array_2D_MultipleDataTypes_OscarGarcia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Object[][] inputDatabase = new Object[4][3];

        // User Input //
        System.out.print("Row 1 | Please enter 3 Integers:");
        for (int i = 0; i < 3; i++) {
            inputDatabase[0][i] = input.nextInt();
        }
        input.nextLine();

        System.out.print("Row 2 | Please enter 3 Characters:");
        for (int i = 0; i < 3; i++) {
            inputDatabase[1][i] = input.next().charAt(0);
        }
        input.nextLine();

        System.out.print("Row 3 | Please enter 3 Strings:");
        for (int i = 0; i < 3; i++) {
            inputDatabase[2][i] = input.next();
        }
        input.nextLine();

        System.out.print("Row 4 | 1 Int, 1 Char, 1 String:");
        inputDatabase[3][0] = input.nextInt();
        inputDatabase[3][1] = input.next().charAt(0);
        inputDatabase[3][2] = input.next();

        System.out.println("\nYour 2D array of multiple data types:\n");

        // Data Type View //
        System.out.println("- Data Type View:");
        System.out.print("               ");
        for (int row = 0; row < inputDatabase.length; row++) {
            for (int col = 0; col < inputDatabase[row].length; col++) {
                if (inputDatabase[row][col] instanceof Integer) {
                    System.out.printf("%-25s", "Integer");
                } else if (inputDatabase[row][col] instanceof Character) {
                    System.out.printf("%-25s", "Character");
                } else if (inputDatabase[row][col] instanceof String) {
                    System.out.printf("%-25s", "String");
                }
            }
            System.out.println();
            if (row < inputDatabase.length - 1) {
                System.out.print("               ");
            }
        }

        // Data Value View //
        System.out.println("\n- Data Value View:");
        System.out.print("               ");
        for (int row = 0; row < inputDatabase.length; row++) {
            for (int col = 0; col < inputDatabase[row].length; col++) {
                System.out.printf("%-25s", inputDatabase[row][col]);
            }
            System.out.println();
            if (row < inputDatabase.length - 1) {
                System.out.print("               ");
            }
        }

        input.close();
    }
}
