
public class practice {

    public static void main(String[] args) {

        System.out.println(sumNums(10));
        System.out.println(sumNums1(10));

    }

    public static int sumNums1(int n) {
        return n * (n + 1) / 2;
    }

    public static int sumNums(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

}
