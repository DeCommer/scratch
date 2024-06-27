
public class practice {

    public static void main(String[] args) {
        
        // int target = 14;
        // int[] testArr= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        // for(int i = 0;  i < testArr.length; i++) {
        //     if(testArr[i] == target){
        //         System.out.println(testArr[i]);
        //     }
        // }
        fizzyBuzz(10);
    }


        //FizzBuzz Practice

        public static int fizzyBuzz(int n) {
            for(int i = 0; i <= n; i++) {
                if(i % 3 == 0 && i % 5 == 0) {
                    System.out.println(i + " Multiple of 3 and 5");
                } else if (i % 3 == 0) {
                    System.out.println(i + " Multiple of only 3");
                } else if (i % 5 == 0) {
                    System.out.println(i+ " Multiple of only 5");
                }else {
                    System.out.println(i + " Mutiple of nither 3 nor 5");
                }
            }
            return n;
        }
}
