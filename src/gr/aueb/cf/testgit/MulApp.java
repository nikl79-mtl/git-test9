package gr.aueb.cf.testgit;

public class MulApp {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int result = multiply(a,b);
        System.out.println("The multiplication of " + a + " and " + b + " is: " + result);
    }
    public static int multiply(int x, int y) {
        return x * y;
    }
}