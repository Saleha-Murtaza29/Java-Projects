import java.util.Scanner;

public class LeapYear{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Year;
        System.out.println("Enter Year.");
         Year = scanner.nextInt();
         if((Year %4 == 0 && Year % 100 != 0) || (Year % 400 == 0)){
             System.out.println(Year +" is a Leap Year.");
         }
         else{
             System.out.println(Year +" is not a Leap Year");
         }
         scanner.close();
        }
    }