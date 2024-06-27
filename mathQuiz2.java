import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;
import java.text.DecimalFormat; 

public class mathQuiz2 {
   static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

      //Declaring variables and setting state
      Random random = new Random();
      double num1;
      double num2;
      // double zeroNumr;
      double answer;
      double percent = 0;
      int score = 0;
      int questionNum = 0;
      int loopNum = 10; //Number of questions
      DecimalFormat df = new DecimalFormat("0.00");  
      String response = "";
      boolean tryAgain = true;
      //Welcome message
      System.out.println("***************************************");
      System.out.println("******** Welcome to Math Quiz *********");
      System.out.println("** For division, round to hundredths **");
      System.out.println("***************************************");

      //Start of while loop main state
      while(tryAgain) {
         for(questionNum = 1; questionNum <= loopNum; questionNum++){ //Loops through questions
            try{
               num1 = (int)random.nextInt(50); //chooses random first number
               num2 = (int)random.nextInt(50); //chooses random second number
               // zeroNumr = (int)random.nextDouble(num2 - 1) + 1;
               String[] operator = {" + ", " - ", " * ", " / "}; //Sets a string to loop over for choosing an operator
               String randOp = operator[(int) (Math.random() * operator.length)]; //Chooses a random operator from set
               System.out.print("\nQ." + questionNum + ": What is " + (int)num1 + randOp + (int)num2 +"? "); //Sets new
               //line, and constructs quiz questions.
               double userAns = input.nextDouble(); //Accepts and stores user's answers
               if(randOp.equals(" + ")) { //Code executes if plus operator is chosen.
                  answer = (int) (num1 + num2); //Does math to arrive at answer.
                  if(userAns == answer) { //Checks if user answer is equal to stored answer.
                     System.out.print(right(response, random)); //Prints result as correct constructed by function below
                     score++; //increments the score
                  } else { // If user answer does not equal stored answer.
                     System.out.print(wrong(response, random) + ", The correct answer is: " + (int)answer); //Informs user
                     //they are wrong and gives correct answer.
                  }  
                  }else if(randOp.equals(" - ")) { //Same as above
                     answer = (int) (num1 - num2);
                     if(userAns == answer) {
                        System.out.print(right(response, random) );
                        score++;
                     } else {
                        System.out.print(wrong(response, random) + ", The correct answer is: " + (int)answer);
                     }  
                  }else if(randOp.equals(" * ")) { //Same as above
                     answer =  (int) (num1 * num2);
                     if(userAns == answer) {
                        System.out.print(right(response, random));
                        score++;
                     } else {
                        System.out.print(wrong(response, random) + ", The correct answer is: " + (int)answer);
                     }  
                  }
                  else if(randOp.equals(" / ")) { //Division is a special case
                     answer = (Double) (num1 / num2); //Result is given by function below
                     String ans2 = df.format(answer); //to truncate decimals
                     Double ans3 = Double.parseDouble(ans2); //if an answer is given as an int, this converts to double
                     if(userAns == ans3) { //Checking answer
                        System.out.print(right(response, random));
                        score++;
                     } else {
                        System.out.print(wrong(response, random)  + ", The correct answer is: " + ans3);
                     }  
            }
            if(loopNum == questionNum) { //Checks question number and continues until current question equals total questions
               tryAgain = false; //Sets game state to false if above is true.
               quizEnd(percent, score, loopNum); //Runs quizEnd function below.
         }
            } catch(InputMismatchException e){ //Checks if users enters invalid text
               System.out.print("Invalid");
               input.next();
               if(loopNum == questionNum) {
                  tryAgain = false;
                  quizEnd(percent, score, loopNum);
               }
            }
         }
      }   
   }
   // wrong function switches responses to incorrect answers from set below.
   public static String wrong(String response, Random random){
      switch(random.nextInt(5) + 1) { //loops through set
         case 1: response = "Wrong"; break;
         case 2: response = "Incorrect"; break;
         case 3: response = "Nope, not right"; break;
         case 4: response = "Sorry, wrong"; break;
         case 5: response = "No"; break;
      }
      return response;
   }
   // right function switches responses to incorrect answers from set below.
   public static String right(String response, Random random) {
      switch(random.nextInt(5) + 1) {
         case 1: response = "Right!"; break;
         case 2: response = "Correct!"; break;
         case 3: response = "You got it right!"; break;
         case 4: response = "Yes!"; break;
         case 5: response = "Good!";
      }
      return response;
   }
   // public static Double div(double num1, double num2) {  **fixed
   //    double divAnswer = num1 / num2;
   //    if(num2 == 0) {
   //       divAnswer = 0.00;
   //    }
   //    return divAnswer;
   // }

   public static void quizEnd(double percent, int score, int loopNum) {
      System.out.println("\n*************************");
      System.out.println("You got " + score + " out of " + loopNum + " correct");
      System.out.print("Your score is: " );
      percent = (double)score / (double)loopNum*100;
      System.out.printf("%.0f", percent);
      System.out.print("%");

      switch((int)percent) {
         case 100: System.out.println(", Great!"); break;
         case 90: System.out.println(", Pretty good"); break;
         case 80: System.out.println(", Not bad."); break;
         case 70: System.out.println(", Okay."); break;
         case 60: System.out.println(", Barely passing."); break;
         default: System.out.println(", You failed");
      }
   }
}