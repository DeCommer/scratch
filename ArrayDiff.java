import java.util.Arrays;

public class ArrayDiff {
    public static void main(String[] blergs) {

        int[] one = {2, 2};
        int[] two = {1, 2, 2};

        System.out.println(Arrays.toString(arrayDiff(one, two)));

    }

public static int[] arrayDiff(int[] a, int[] b) {
        int[] result;

        int size = a.length;

        if (a.length == 0 || b.length == 0) {
            return a;
        } else {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b.length; j++) {
                    if (a[i] == b[j]) {
                        size--;
                        break;
                    }
                }
            }
            result = new int[size];
            
            int index = 0;
            int countEq = 0;
            for (int i = 0; i < a.length; i++) {
                countEq = 0;
                for (int j = 0; j < b.length; j++) {
                    if (a[i] == b[j]) {
                        countEq++;
                        break; 
                    }
                }
                if (countEq == 0) {
                    result[index] = a[i];
                    index++;
                }
            }
        }
        return result;
    }
}
