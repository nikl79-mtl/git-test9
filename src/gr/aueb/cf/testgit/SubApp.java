package gr.aueb.cf.testgit;

public class SubApp {
    static void main() {
        System.out.println("SubApp running...");
        System.out.println(sub(4,2));
    }

    static int sub(int a, int b) {
        return a - b;
    }
}
