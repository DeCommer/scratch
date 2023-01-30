//import java.util.Arrays;
//import java.util.stream.Collectors;

public class StringReverse {
    public static void main(String[] args)
    {
        String string = "I evol ym !ecnatsnoC";
        System.out.println(reverseWords(string));
    }

    public static String reverseStr(String input)
    {
        if(input.equals("")) {
            return "";
        }
        return reverseStr(input.substring(1)) + input.charAt(0);
    }

/*     public static String reverseStrInPlace(String input) //function not used
    { 
        String reversed = Arrays.stream(input.split(" "))
        .map(word -> new StringBuilder(word).reverse())
        .collect(Collectors.joining(" "));
        
        return reversed;
    } */

    public static String reverseWords(final String original) //function
    { 
      String[] array = original.split(" ");
      if(array.length == 0) 
          return original;
      int i = 0;
      for(String string : array)
      {
          array[i] = new StringBuilder(string).reverse().toString();
          i++;
      }
      return String.join(" ",array);
    }
}
