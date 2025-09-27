import java.util.Scanner;

public class SimpleCalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num1,num2;
        char operator;
        System.out.println("----------Simple Calculator----------");
        System.out.println("");
        System.out.println("Enter two numbers.");
        System.out.println("");
        System.out.println("Enter 1st number.");
        num1 = scanner.nextFloat();
        System.out.println("Enter 2nd number.");
        num2 = scanner.nextFloat();
        System.out.println("Enter Operator.");
        operator = scanner.next().charAt(0);
        switch(operator){
            case '+':
            System.out.println("Sum of "+num1+" and "+num2+" is "+ (num1+num2)+" ." );
            break;
            case '-':
            System.out.println("Difference/Subtraction of "+num1+" and "+num2+" is "+ (num1-num2)+"." );
            break;
            case '*':
            System.out.println("Multiplication of "+num1+" and "+num2+" is "+ (num1*num2)+"." );
            break;
            case '/':
            if(num2==0)
            System.out.println("Division of "+num1+" and "+num2+" is not allowed.");
            else
            System.out.println("Division of "+num1+" and "+num2+" is "+ (num1/num2)+"." );
            break;
            default:
            System.out.println("Invalid operator entered. Try again!");
        }
        scanner.close();
    }
}