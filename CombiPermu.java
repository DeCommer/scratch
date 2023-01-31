public class CombiPermu {

    /* combinations = nCr = n! / r!(n-r)!
     * Each k-combination of a set S of n elements has k! permutations
     * 
    */

    //permutations = nPr = n! / (n - r)!
    
    public static void main(String[] args) 
    {
        //Print all permutations of a string
        String sampleString = "joe";
        int n = sampleString.length();
        CombiPermu permutation = new CombiPermu();
        permutation.permute(sampleString, 0, n - 1);

    }
    public void permute(String str, int start, int end) 
    {
        if(start == end)
            System.out.println(str);
            else
            {
                for(int i = start; i <= end; i++) 
                {
                    str = swap(str, start, i);
                    permute(str, start + 1, end);
                    str = swap(str, start, i);
                }
            }
    }
    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArr = a.toCharArray();
        temp = charArr[i];
        charArr[i] = charArr[j];
        charArr[j]  = temp;
        return String.valueOf(charArr);
    }

    public int factorial(int num) 
    {
        if(num == 0) 
        {
            return 1;
        } else
            return num * factorial(num - 1);
    }
}
