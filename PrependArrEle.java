import java.util.ArrayList;
import java.util.List;

//Prepends numbers to elements in array

public class PrependArrEle
{
    public static void main(String[] blergs) 
    {
        List<String> strList = new ArrayList<String>();
        strList.add("a");
        strList.add("b");
        strList.add("c");
        System.out.println(strList);
        System.out.println(number(strList));
    }


    public static List<String> number(List<String> lines) 
    {
        List<String> result = new ArrayList<String>();
        for (int i = 1; i < lines.size() + 1; i++) 
        {
            result.add( String.valueOf(i) + ": " + lines.get(i-1));
        }
        return  result;
    }
}
