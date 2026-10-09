import java.util.Scanner;

public class LoopExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;

        do {
            System.out.println("The loop is running...");
            
            // Your core program logic goes here
            
            System.out.print("Do you want to continue? (yes/no): ");
            answer = scanner.nextLine();
            
        } while (!answer.equalsIgnoreCase("no")); // Keeps running until answer is "no"

        System.out.println("Loop stopped. Goodbye!");
        scanner.close();
    }
}
