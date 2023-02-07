import java.util.Scanner;

public class quizGame {
    public static void main(String[] args) {

      /*
       * This is sample code that is not functional
       */

      int score = 0;
      int answer;
      boolean isNotCorrect = true;
      Scanner input = new Scanner(System.in);
      //var exit = 'x';

      while(isNotCorrect){
         double num1 = Math.round(Math.random() * 100);
         double num2 = Math.round(Math.random() * 100);
         String[] operator = {" + ", " - ", " * ", " / "};
         String randOp = operator[(int) (Math.random() * operator.length)];
         System.out.println("press x to exit");
         System.out.print("\nWhat is " + num1 + randOp + num2 +"? ");
         
         double userAns = input.nextDouble();
         if(randOp.equals(" + ")) {
            answer = (int) (num1 + num2);
            if(userAns == answer) {
               System.out.println("Right!");
               score++;
               System.out.println("Your score is: " + score);
            } else {
               System.out.println("wrong, Try again");
               isNotCorrect = true;
            }  
         }else if(randOp.equals(" - ")) {
               answer = (int) (num1 - num2);
               if(userAns == answer) {
               System.out.println("Right!");
               score++;
               System.out.println("Your score is: " + score);
               } else {
               System.out.println("wrong, Try again");
               isNotCorrect = true;
               }  
            }else if(randOp.equals(" * ")) {
               answer = (int) (num1 * num2);
               if(userAns == answer) {
               System.out.println("Right!");
               score++;
               System.out.println("Your score is: " + score);
               } else {
               System.out.println("wrong, Try again");
               isNotCorrect = true;
               }  
            }else if(randOp.equals(" / ")) {
               answer = (int) (num1 / num2);
               if(userAns == answer) {
               System.out.println("Right!");
               score++;
               System.out.println("Your score is: " + score);
               } else {
               System.out.println("wrong, Try again");
               isNotCorrect = true;
               }  
            }
      }
      input.close();
   }    
}
