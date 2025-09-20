import java.util.Scanner;
public class AgeCalculator{
    public static void main(String[] args) { 
       Scanner scanner = new Scanner(System.in);
       int currentyear;
       int birthyear;
       int yourage;
       System.out.println("Enter Current Year. ");
       currentyear = scanner.nextInt();
       System.out.println("Enter Your Birth Year. ");
       birthyear = scanner.nextInt();
       yourage = currentyear - birthyear;
       System.out.println("You are "+ yourage +" years old.");
       scanner.close();

    }

    }
