import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Upisite broj: ");
                String unos = input.nextLine();
                int broj = Integer.parseInt(unos);

                if (broj < 0) {
                    throw new IllegalArgumentException("Faktorijelu nije moguce izracunati za negativan broj!");
                }

                System.out.println("Faktorijela unesenog broja: " + calculateFactorial(broj));
                break; // izadi iz petlje
            } catch (NumberFormatException e) {
                System.out.println("POgresan unos! Morate upisati broj.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        input.close();
    }

    private static long calculateFactorial(int broj) {
        long factorial = 1;
        for (int i = 1; i <= broj; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
