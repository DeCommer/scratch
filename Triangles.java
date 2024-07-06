public class Triangles {

    public static void main(String[] args){
        int n = 3;
            
        leftSide(n);
        rightSide(n);
        fullTriangle(n);
        }

    public static void rightSide(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void leftSide(int n){

        for(int i = 0; i < n; i++) {
            for(int j = 2 * (n-i); j >= 0; j--) {
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void fullTriangle(int n) {
        
        for(int i = 0; i < n; i++) {
            for(int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
