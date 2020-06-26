public class App {
    public static int function(int a, int b, int c) {
        int min = Math.min(Math.min(a, b), c);

        for (int i = min; min > 0; i--) {
            if ((a % i == 0) && (b % i == 0) && (c % i == 0)) {
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(function(400, 300, 750));
    }
}
