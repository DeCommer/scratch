import java.util.Scanner;
import java.text.DecimalFormat;

public class Beginagain{
    public static void main(String[] args){


        //kilo to lb weight converter
        Scanner input = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("##.00");

        double lb = 2.205;

        System.out.print("Enter amount in kg: ");
        double userKilo = input.nextDouble();
        //input.nextLine();

        System.out.println(userKilo + " Kilos is about " + f.format(userKilo * lb) + " pounds.");
        input.close();
    }
}