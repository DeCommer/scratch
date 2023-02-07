public class Bigguns {
    public static void main(String[] args) {
        String a = "63829983432984289347293874";    
        String b = "90938498237058927340892374089";

        System.out.println(add(a, b));
    }
    public static String add(String a, String b) {
        int aLen = a.length();
        int bLen = b.length();
        int maximum = Math.max(aLen, bLen) + 1;
        char[] digitChar = new char[maximum];
        for (int i = 0; maximum > 0; i /= 10) {
            if (aLen > 0)
                i += a.charAt(--aLen) - '0';
            if (bLen > 0)
                i += b.charAt(--bLen) - '0';
                digitChar[--maximum] = (char) ('0' + i % 10);
        }
        for (maximum = 0; maximum < digitChar.length - 1 && digitChar[maximum] == '0'; maximum++){}
        return new String(digitChar, maximum, digitChar.length - maximum);
      }
}
