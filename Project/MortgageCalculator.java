import java.text.NumberFormat;
import java.util.Scanner;
 
public class MortgageCalculator {
    public static void main(String[] args) {
        System.out.println("=== Bangladesh Mortgage Calculator (Dollar) ===");
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter loan amount (principal in BDT): ");
        int principal = sc.nextInt();
 
        System.out.print("Enter annual interest rate: ");
        float interest = sc.nextFloat();
 
        System.out.print("Enter loan period (in years): ");
        int years = sc.nextInt();
 
        float interestRate = (interest / 100 / 12);  
        int totalMonth = years * 12;           
 
        double mortgage = (double) principal * ( interestRate* Math.pow(1 + interestRate, totalMonth)) / (Math.pow(1 + interestRate, totalMonth) - 1); 
        double totalPayment = mortgage * totalMonth;
        double totalInterest = totalPayment - principal;
 
        System.out.println("=== Mortgage Summary ===");
 
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        String principalAmmount = currencyFormatter.format(principal);
        System.out.println("Loan Amount: "+principalAmmount);
        String monthlyInterest = currencyFormatter.format(mortgage);
        System.out.println("Monthly Payment: "+monthlyInterest);
        String totalAmmount = currencyFormatter.format(totalPayment);
        System.out.println("Total Payment: "+totalAmmount);
        String interestAmmount = currencyFormatter.format(totalInterest);
        System.out.println("Total Interest: "+interestAmmount);
   
    }
}