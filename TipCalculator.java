import java.util.Scanner;
public class TipCalculator{
    public static void main(String[] args) { 
       Scanner scanner = new Scanner(System.in);
       double billamount;
       double tippercent;
       double tipamount;
       double totalbill;
       System.out.println("Enter Your Bill Amount. ");
       billamount = scanner.nextDouble();
       System.out.println("Enter Tip Percent. ");
       tippercent = scanner.nextDouble();
       //We can write 15% tip as 15/100 which is equals to 0.15.
       tipamount = billamount * (tippercent/100); //As We're taking tip percent form user, then, calculate tip amount as billamount * (tipPercent/100).
       totalbill = billamount + tipamount;
       System.out.println("You entered a Bill amount of "+ billamount +" with a Tip Percent of "+ tippercent +" %.");
       System.out.println("Your Tip amount is "+ tipamount +".");
       System.out.println("Your total bill is "+ totalbill +".");
       scanner.close();


    }

    }
