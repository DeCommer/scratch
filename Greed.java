import java.util.Random;
import java.util.Arrays;

public class Greed 
{
    /*
     * Greed is a dice game played with five six-sided dice. 
     * Your task is to score a throw according to these rules. 
     * You will always be given an array with five six-sided dice values.
     * 
     * A single die can only be counted once in each roll. 
     * For example, a given "5" can only count as part of a triplet 
     * (contributing to the 500 points) or as a single 50 points, 
     * but not both in the same roll.
     * 
     *  Three 1's => 1000 points
     *  Three 6's =>  600 points
     *  Three 5's =>  500 points
     *  Three 4's =>  400 points
     *  Three 3's =>  300 points
     *  Three 2's =>  200 points
     *  One   1   =>  100 points
     *  One   5   =>   50 point
     */

    public static void main(String[] args) 
    {

        //int[] roll2 = {5, 3, 3, 3, 4}; 
        int[] roll = randomArray();
        
       // System.out.println("Array is: " + Arrays.toString(randomArray()));
       System.out.println(Arrays.toString(roll));
       System.out.println("Score is: " + greedy(roll));

    }
    public static int greedy(int[] dice) 
    {
        int res = 0;
        int[] rollArray = new int[7];
        for(int j : dice) rollArray[j]++;

        for(int i = 1; i < rollArray.length; i++)
        {
            if(i == 1)
            { // 1 and 5 are scored different and thus singled out
                res += (rollArray[i] > 2 ? 1000 + (rollArray[1] - 3) * 100: rollArray[1] * 100);
            }else if (i == 5)
            { // 5 and 1 are scored different and thus singled out
                res += (rollArray[i] > 2 ? 500 + (rollArray[5] - 3) * 50 : rollArray[5] * 50);
            } else
            {
                res += (rollArray[i] > 2 ? i * 100 : 0);
            }
        }
        return res;
    }
    public static int[] randomArray()
    {
        Random rand = new Random();
        int[] randArr = new int[6];

        for(int i = 0; i < randArr.length; i++)
        {
            randArr[i] = rand.nextInt(6);
        }
        return randArr;
    }
}
