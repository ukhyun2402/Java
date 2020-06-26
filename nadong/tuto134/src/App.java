import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int N = 50;

        int[][] a = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                a[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println(Arrays.deepToString(a));
    }
}
