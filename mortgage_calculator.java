import java.util.Scanner;
import java.text.NumberFormat;
import java.awt.*;

class Main {
    public static void main(String args[]) {
        double mortgage;
        float monthlyInterest;
        final byte PERCENT = 100;
        final byte MONTHS = 12;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Annual Interest Rate: ");
        float interestRate = scanner.nextFloat();

        System.out.print("Number of payments: ");
        int numberOfPayments = scanner.nextInt();

        monthlyInterest = interestRate / (PERCENT * MONTHS);

        mortgage = monthlyInterest * Math.pow(monthlyInterest + 1, numberOfPayments);
        mortgage /= (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        mortgage *= principal;
        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));
    }
}