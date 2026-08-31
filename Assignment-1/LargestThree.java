public class LargestThree {
    public static void main(String[] args) {
        int a = 25;
        int b = 40;
        int c = 18;

        if (a >= b && a >= c) {
            System.out.println(a + " is the largest number.");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is the largest number.");
        } else {
            System.out.println(c + " is the largest number.");
        }
    }
}