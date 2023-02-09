import java.util.Scanner;
public class Scratch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Number only, a letter should result in error: ");
        double input =  scanner.nextDouble();

        System.out.println("You entered the number " + input);

            if(!scanner.hasNextDouble()){
                System.out.println("Not a number, try again");
                input =  scanner.nextDouble();
            }
        scanner.close();
    }
}
