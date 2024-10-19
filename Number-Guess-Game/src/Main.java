import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Have a method to generate a random number
        generateNumber();
        int random_num = generateNumber();

        //Counter for wrong answers
        int counter = 0;

        //enter a while loop
        while (true) {
            if (counter == 5) {
                System.out.println("You got the answer wrong 5 times! The answer was "+ random_num);
                counter = 0;
                break;
            } else {

                //Tell user to choose a number from 1 to 10
                Scanner scanner = new Scanner(System.in);
                System.out.println("Choose a number between 1 and 50: ");

                //Add input to allow user to choose
                int value = Integer.valueOf(scanner.nextLine());

                //if user guesses correct, tell them they are correct
                if (value == random_num) {
                    System.out.println("Correct! The answer is " + random_num);
                    break;

                    //if user guesses wrong, add to a counter(if counter reaches 5, tell them the number and prompt to play again
                } else {

                    //if wrong tell user if they are above or below the random number
                    if (value > random_num) {
                        counter++;
                        System.out.println("Wrong! The answer is lower!");
                    } else {
                        counter++;
                        System.out.println("Wrong! The answer is higher!");
                    }
                }
            }
        }
    }

    public static int generateNumber (){
        Random rand = new Random();
        int upperbound = 50;
        int int_random = rand.nextInt(upperbound);
        return int_random;
    }
}