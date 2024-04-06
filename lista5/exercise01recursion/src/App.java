public class App {
    public static void main(String[] args) {
        int n = 5, result = 1;

        result = fatorial(n);
        System.out.println("result = " + result);
        /*
        int n = 5, result = 1;

        for (int i = n; i > 1; i--) {
            result *= i;
        }

        System.out.println("result " + result);
        */

    }

    static int fatorial(int n) {
        if(n == 0 || n == 1) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }
}
