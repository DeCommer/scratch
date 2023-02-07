import java.util.Random;
import java.util.Scanner;

public class mathQuiz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int num1;
        int num2;
        int score = 0;
        int correct;
        int userAns;
        int loopNum = 10;
        double percent = 0;
        String question;
        String response = "";
        System.out.println("************");
        System.out.println(" Math Quiz!");
        System.out.println("************\n");

        for(int count = 1; count <= loopNum; count++) {
            num1 = rand.nextInt(10);
            num2 = rand.nextInt(10);

            correct = num1 * num2; //add logic to randomize operation
            question = count + ". What is " + num1 + " x " + num2 + "? ";

            System.out.print(question);
            userAns = input.nextInt();

            if(userAns == correct) {
                switch(rand.nextInt(4)+1) {
                    case 1: response = " ~~Right"; score++; break;
                    case 2: response = " ~~Correct"; score++; break;
                    case 3: response = " ~~You got it right"; score++; break;
                    case 4: response = " ~~Great"; score++; break;
                    }
                }else {
                    switch(rand.nextInt(4) + 1) {
                        case 1: response = " ~~Wrong"; break;
                        case 2: response = " ~~Incorrect"; break;
                        case 3: response = " ~~Nope, not right"; break;
                        case 4: response = " ~~Sorry, wrong"; break;
                    }
                }
                System.out.println(response);
            }

            System.out.println("*****************");
            System.out.print("You scored: ");
            percent = (double)score / (double)loopNum*100;
            System.out.printf("%.0f", percent);
            System.out.print("% ");

            switch((int)percent) {
                case 100: System.out.println("Great!"); break;
                case 90: System.out.println("Not bad"); break;
                case 80: System.out.println("Okay"); break;
                case 70: System.out.println("meh"); break;
                case 60: System.out.println("You passed... barely"); break;
                default: System.out.println("You failed");
            }
            input.close();
            
    }

}
