
public class practice {

    public static void main(String[] args) {
        
        int target = 14;

        int[] testArr= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        for(int i = 0;  i < testArr.length; i++) {
            if(testArr[i] == target){
                System.out.println(testArr[i]);
            }
        }
    }
}