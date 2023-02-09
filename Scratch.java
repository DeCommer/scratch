
import java.util.InputMismatchException;
import java.util.Scanner;
public class Scratch {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        boolean tryAgain = true;
        
        double answer = 0;
        while(tryAgain) {
            try{
            System.out.println("Enter a number: ");
            answer = input.nextDouble(); 
            System.out.println(answer); 
            tryAgain = false; 
            }
            catch(InputMismatchException e) {
                System.out.println("Invalid, try again");
                input.next();
            }
        }
    }
}
