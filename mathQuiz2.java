import java.util.Scanner;
import java.util.Random;



public class mathQuiz2 {
    public static void main(String[] args) {
      Random random = new Random();
      /*
       *  work in progress
       * current issues to solve
       * 1. response when user enters a non-numberic character
       * 2. fix division operation
       * 
       */
      double num1;
      double num2;
      double answer;
      double percent = 0;
      int score = 0;
      int loopNum = 5;

      

      String response = "";
      Scanner input = new Scanner(System.in);
      String validate = "A,a,B,b,C,cD,d,E,e,F,f,G,g,H,h,I,i,J,j,K,k,L,l,M,m,N,n,O,o,P,p,Q,q,R,r,S,s,T,t,U,u,V,v,W,w,X,x,Y,yZ,z";
      String[] spValidate = validate.split(",");

      for(int questionNum = 1; questionNum <= loopNum; questionNum++){
         num1 = (int)random.nextInt(10);
         num2 = (int)random.nextInt(10);
         String[] operator = {" + ", " - ", " * ", " / "};
         String randOp = operator[(int) (Math.random() * operator.length)];
         System.out.print("\nQ." + questionNum + ": What is " + (int)num1 + randOp + (int)num2 +"? ");
         double userAns = input.nextDouble();
         
         if(randOp.equals(" + ")) {
            answer = (int) (num1 + num2);
            if(userAns == answer) {
               System.out.print(right(response, random));
               score++;
            } else {
               System.out.print(wrong(response, random));
            }  
            }else if(randOp.equals(" - ")) {
               answer = (int) (num1 - num2);
               if(userAns == answer) {
                  System.out.print(right(response, random));
                  System.out.println(", The correct answer is: " + answer);
               score++;
               } else {
                  System.out.print(wrong(response, random));
                  System.out.println(", The correct answer is: " + answer);
               }  
            }else if(randOp.equals(" * ")) {
               answer = (int) (num1 * num2);
               if(userAns == answer) {
                  System.out.print(right(response, random));
               score++;
               } else {
                  System.out.print(wrong(response, random));
                  System.out.println(", The correct answer is: " + answer);
               }  
            }
            
            else if(randOp.equals(" / ")) { //improve division handling
               answer = num1 / num2;
               if(userAns == answer) {
                  System.out.print(right(response, random));
               score++;
               } else {
                  System.out.print(wrong(response, random));
                  System.out.println(", The correct answer is: " + answer);
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
         case 1: response = "Wrong"; break;
         case 2: response = "Incorrect"; break;
         case 3: response = "Nope, not right"; break;
         case 4: response = "Sorry, wrong"; break;
      }
      return response;
   }

   public static String right(String response, Random random) {
      switch(random.nextInt(4) + 1) {
         case 1: response = "Right"; break;
         case 2: response = "Correct"; break;
         case 3: response = "You got it right"; break;
         case 4: response = "Great"; break;
      }
      return response;
   }

   public static int div(double num1, double num2) {
      double divAnswer = num1 / num2;
      return (int)divAnswer;
   }
}