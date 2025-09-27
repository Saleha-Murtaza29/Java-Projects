import java.util.Scanner;

public class Bank{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("----------Welcome to your Bank account----------");
        System.out.println("1. View Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("");
        System.out.println("Enter Your Choice");
         choice = scanner.nextInt();
         switch (choice){
            case 1:
                 System.out.println("Viewing Balance.");
                 break;
            case 2:
                 System.out.println("Proceeding to Deposit.");
                 break;           
            case 3:
                 System.out.println("Initiating Withdrawal.");
                 break;
            case 4:
                 System.out.println("Exiting. Thank You!.");
                 break;
            default:
                   System.out.println("Invalid choice. Please try again!");
         }
         scanner.close();


    }
}
        