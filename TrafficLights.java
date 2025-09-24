import java.util.Scanner;

public class TrafficLights{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String color;
        System.out.println("Enter Traffic Light color.");
        color = scanner.nextLine();
        if(color.equals("Red")){
            System.out.println("Stop!");
        }
        else if(color.equals("Yellow")){
            System.out.println("Slow Down!");
        }
        else if(color.equals("Green")){
            System.out.println("Go!");
        }
        else{
              System.out.println("Invalid color. Please enter red, yellow, or green.");
        }
        scanner.close();
    }
}
        