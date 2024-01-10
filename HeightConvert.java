import java.util.Scanner;
import java.text.DecimalFormat;


public class HeightConvert {
    public static void main(String[] args) 
    {
        
        Scanner input = new Scanner(System.in);

        //double height = 5.9;
        DecimalFormat f = new DecimalFormat("##.00");

        System.out.println("------ Height converter! ---------");
        System.out.println("Enter your height in feet to convert to either centimeters or inches.");
        System.out.print("For ft enter as decimal. ex: 5' 9 '' = 5.9: ");
        double height = input.nextDouble();
        input.nextLine();

        double toInches = height * 12;
        double toCentimeters = height * 30.48;

        System.out.print("Press \'c\' for centimeters, and \'i \'for inches: ");
        String response = input.nextLine();
        
        if(response.equals("c"))
        {
            System.out.println("The height of " + height + " in centimeters is: " + f.format(toCentimeters) + "cm.");
        } else if(response.equals("i"))
        {
            System.out.println("The height of " + height + " in inches is: " + f.format(toInches) + "in.");
        }
        input.close();
    }
}
