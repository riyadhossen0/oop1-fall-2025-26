import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class MortgageCalculator{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter Your Salary:");
      double salary = 0;
      if(sc.hasNextDouble()){
        salary = sc.nextDouble();
        System.out.print("Enter Your Credit Score(0-500): ");
        int credit = sc.nextInt();
        if(credit > 500){
          System.out.println("Enter A Valid Credit Score(0-500)");
        }else{
          System.out.print("Do You Have Any Criminal Record(eg:true/false): ");
          boolean record = false;
          if(sc.hasNextBoolean()){
            record = sc.nextBoolean();

            if (record == true) {
              System.out.println("You are not eligible for loan.");
            }else{
              double loan = salary*2;

              System.out.println("=== Bangladesh Mortgage Calculator (Dollar) ===");
              System.out.print("Enter loan amount (principal in BDT): ");
              double principal = sc.nextDouble();

              if (( principal <= loan && credit >= 300) && record==false ){
                System.out.print("Enter annual interest rate: ");
                float interest = sc.nextFloat();
                System.out.print("Enter loan period (in years): ");
                int years = sc.nextInt();
                float interestRate = (interest / 100 / 12);  
                int totalMonth = years * 12;

                double mortgage = (double) principal * ( interestRate* Math.pow(1 + interestRate, totalMonth)) / (Math.pow(1 + interestRate, totalMonth) - 1); 
                double totalPayment = mortgage * totalMonth;
                double totalInterest = totalPayment - principal;

                Locale bdlocale = Locale.of("en", "BD");
                NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(bdlocale);
                System.out.println("=== Mortgage Summary ===");
                System.out.println("Loan Amount: "+currencyFormatter.format(principal));
                String monthlyInterest = currencyFormatter.format(mortgage);
                System.out.println("Monthly Payment: "+monthlyInterest);
                String totalAmmount = currencyFormatter.format(totalPayment);
                System.out.println("Total Payment: "+totalAmmount);
                String interestAmmount = currencyFormatter.format(totalInterest);
                System.out.println("Total Interest: "+interestAmmount);
                sc.close();
              }else{
                System.out.println("You Are Not Eligeble For Loan.");
              }
            }
          }else{
            System.out.println("Enter A Valid Record(eg:true/false)");
          }
        }
      }else{
        System.out.println("Invalid input.Please enter a number.");
      }
    }  
}
