//Insert packagae name here

import java.util.Scanner;

/**
 * Purpose: Skills Demo 1
 * @author Insert Student Name Here
 * Date: 
 */

public class StudentQuizGame {

    public static void main(String[] args) {
        
        //Declare and instantiate an object of the Scanner class
        Scanner scanner = new Scanner(System.in);

        //Variables to implement the quiz game logic
        char playAgain;
        
        
        //Repeat the following block of code

        // Ask for the user's name and display a welcome message
        System.out.println("Welcome to the Quiz Game!");

        
            // Keep track of the player's score
            

            // Question 1: Mathematical Operators
            System.out.println("Question 1: What is the result of the following expression: 5 + 3?");
            System.out.println("A. 10");
            System.out.println("B. 8");
            System.out.println("C. 12");
            System.out.print("Your answer: ");
            char answer1 = scanner.next().charAt(0);

            // Evaluate the answer using if-else
            int result1 = 5 + 3;  // Using mathematical operators
            if (answer1 == 'B' || answer1 == 'b') {
                System.out.println("Correct!");

            } else {
                System.out.println("Wrong! The correct answer is B. "+ result1);
            }

           
            // Question 2: Mathematical Operators
            
            
            // Question 3: Relational Operators
            
            
            // Question 4: Boolean Operators

            
            
            // Ask if the user wants to play again
            System.out.print("\nDo you want to play again? (Y/N): ");
            playAgain = scanner.next().charAt(0);

        
        //End of Repeat Code Block Section    
            

        // Goodbye message

        
        //Close scanner
        scanner.close();
        
    } //end main 
} //end class 
