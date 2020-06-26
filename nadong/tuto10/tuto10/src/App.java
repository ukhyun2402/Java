public class App {

    public static int fact(int num) {
        if (num == 1) {
            return 1;
        }
        return fact(num - 1) * num;
    }

    public static int fibo(int num) {
        if (num < 3) {
            return 1;
        } else {
            return fibo(num - 1) + fibo(num - 2);
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(fibo(50));
    }
}
