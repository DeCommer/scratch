import java.util.Scanner;
import java.text.DecimalFormat;


public class WeightConvert {
    public static void main(String[] args) 
    {
        
        Scanner input = new Scanner(System.in);

        //double height = 5.9;
        DecimalFormat f = new DecimalFormat("##.00");

        System.out.println("------ Height convertor! ---------");
        System.out.print("Enter you height: ");
        double height = input.nextDouble();
        input.nextLine();

        double toInches = height * 12;
        double toCentimeters = height * 30.48;

        System.out.print("Press \'c\' for centimeters, and \'i \'for inches: ");
        String response = input.nextLine();
        
        if(response.equals("c"))
        {
            System.out.println(height + " in centimeters is: " + f.format(toCentimeters));
        } else if(response.equals("i"))
        {
            System.out.println(height + " in inches is: " + f.format(toInches));
        }
        input.close();
    }
}
