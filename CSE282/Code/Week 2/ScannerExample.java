import java.util.Scanner;

public class ScannerExample {
     public static void main(String args[]) {
         Scanner scanner = new Scanner(System.in);
         int n;
         n = scanner.nextInt();
         double cg;
         cg = scanner.nextDouble();
         System.out.println(n);
         String x;
         scanner.nextLine();
         x= scanner.nextLine();
         System.out.println(x);
     }
 }