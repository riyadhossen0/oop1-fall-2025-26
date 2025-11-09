import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salary = getMySalary(scanner);
        double credit = getMyCredit(scanner);
        boolean criminalRecord = getMyCriminal(scanner);
        

        if (criminalRecord == true || credit < 300) {
              System.out.println("Sorry,You are not eligible for loan.");
            }else{
      
        
        System.out.println("=== Bangladesh Mortgage Calculator (BDT) ===");

        System.out.print("Enter loan amount (Principal in BDT): ");
        double principal = scanner.nextDouble();
        double loan = salary*2;
         if (loan > principal) {
            System.out.println(" Congratulations! You are eligible for the loan.");
       

        System.out.print("Enter annual interest rate (e.g., 8.5 for 8.5%): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter loan period (in years): ");
        int years = scanner.nextInt();

       
        double monthlyInterestRate = (annualInterestRate / 100) / 12;
        int numberOfPayments = years * 12;

        double mortgagePayment = principal
                * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

       
        double totalPayment = mortgagePayment * numberOfPayments;
        double totalInterest = totalPayment - principal;

       
        Locale bdLocale = Locale.of("en", "BD");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(bdLocale);

        System.out.println("\n=== Mortgage Summary ===");
        System.out.println("Loan Amount: " + currencyFormatter.format(principal));
        System.out.println("Monthly Payment: " + currencyFormatter.format(mortgagePayment));
        System.out.println("Total Payment: " + currencyFormatter.format(totalPayment));
        System.out.println("Total Interest: " + currencyFormatter.format(totalInterest));
         } else {
            System.out.println("Sorry,You are not eligible for loan.");
      }
    }
}

        public static double getMySalary(Scanner scanner) {
        double salary = 0;
        while (true) {
            System.out.print("Enter your monthly salary (in BDT): ");
            if (scanner.hasNextDouble()) {
                salary = scanner.nextDouble();
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
    }
    return salary;
  
}
        public static double getMyCredit(Scanner scanner) {
        double credit = 0;
        while (true) {
            System.out.print("Enter your credit score (0-500): ");
            if (scanner.hasNextDouble()) {
                credit = scanner.nextDouble();
                if (credit >= 0 && credit <= 500) {

                    break;
                }else{
                    System.out.println("Credit Score Must be between 0 to 500.");
                }
            } else {
                System.out.println("Invalid input. Please enter a credit score(0-500).");
                scanner.next();
            }
    }
    return credit;
  
}
        public static boolean getMyCriminal(Scanner scanner) {
        boolean criminalRecord = false;
        while (true) {
            System.out.print("Do you have any criminal Record(true/false): ");
            if (scanner.hasNextBoolean()) {
                criminalRecord = scanner.nextBoolean();
                   break;
                } else {
                System.out.println("Invalid input. Please enter true/false.");
                scanner.next();
            }
        }
        return criminalRecord;
    }
}
  
