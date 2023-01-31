//import java.util.Arrays;
import java.util.Random;

public class RandomArray
{
    
    public static void main(String[] args)
    {

    } 

    public static int[] randomArray(int[] random) 
    {
        Random rand = new Random();
        int[] randArr = new int[5];
        for(int i = 0; i < randArr.length; i++)
        {
            randArr[i] = rand.nextInt(1, 6);
        }
        return randArr;
    }
}
