import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {

        int n;

        Scanner sc = new Scanner(System.in);

        n=sc.nextInt();

        int[] x = new int[n];

        for (int i = 0; i <n ; i++) {
            x[i] =sc.nextInt();
        }

    }
}
