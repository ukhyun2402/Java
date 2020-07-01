import java.util.Arrays;
import java.util.Scanner;
// import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Input array length >>");
        int length = sc.nextInt();

        int[] arr = new int[length];

        // input Random number to array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr));
    }
}