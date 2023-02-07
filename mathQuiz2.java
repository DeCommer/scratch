import java.util.Scanner;
import java.util.Random;

public class mathQuiz2 {
    public static void main(String[] args) {

      Random random = new Random();

      /*
       *  work in progress
       */

      int num1;
      int num2;
      int answer;
      int score = 0;
      double percent = 0;
      int loopNum = 10;
      String response = "";
      Scanner input = new Scanner(System.in);

      for(int questionNum = 1; questionNum <= loopNum; questionNum++){
         num1 = random.nextInt(10);
         num2 = random.nextInt(10);
         String[] operator = {" + ", " - ", " * ", " / "};
         String randOp = operator[(int) (Math.random() * operator.length)];
         System.out.print("\nQ." + questionNum + ": What is " + num1 + randOp + num2 +"? ");
         
         double userAns = input.nextDouble();
         if(randOp.equals(" + ")) {
            answer = (int) (num1 + num2);
            if(userAns == answer) {
               System.out.println("\t" + right(response, random));
               score++;
            } else {
               System.out.println("\t" + wrong(response, random));
            }  
            }else if(randOp.equals(" - ")) {
               answer = (int) (num1 - num2);
               if(userAns == answer) {
                  System.out.println("\t" + right(response, random));
               score++;
               } else {
                  System.out.println("\t" + wrong(response, random));
               }  
            }else if(randOp.equals(" * ")) {
               answer = (int) (num1 * num2);
               if(userAns == answer) {
                  System.out.println("\t" + right(response, random));
               score++;
               } else {
                  System.out.println("\t" + wrong(response, random));
               }  
            }else if(randOp.equals(" / ")) { //imporve division handling
               answer = (int) (num1 / num2);
               if(userAns == answer) {
                  System.out.println("\t" + right(response, random));
               score++;
               } else {
                  System.out.println("\t" + wrong(response, random));
               }  
            }
      }
      System.out.println("\n*************************");
      System.out.print("You scored: ");
      percent = (double)score / (double)loopNum*100;
      System.out.printf("%.0f", percent);
      System.out.print("% ");

      switch((int)percent) {
         case 100: System.out.println("Great!"); break;
         case 90: System.out.println("Pretty good"); break;
         case 80: System.out.println("Not bad."); break;
         case 70: System.out.println("meh"); break;
         case 60: System.out.println("Not good"); break;
         default: System.out.println("You failed");
     }
      input.close();
   }    

   public static String wrong(String response, Random random){
      switch(random.nextInt(4) + 1) {
         case 1: response = " ~~Wrong"; break;
         case 2: response = " ~~Incorrect"; break;
         case 3: response = " ~~Nope, not right"; break;
         case 4: response = " ~~Sorry, wrong"; break;
      }
      return response;
   }

   public static String right(String response, Random random) {
      switch(random.nextInt(4) + 1) {
         case 1: response = " ~~Right"; break;
         case 2: response = " ~~Correct"; break;
         case 3: response = " ~~You got it right"; break;
         case 4: response = " ~~Great"; break;
      }
      return response;
   }
}
