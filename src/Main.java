import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // https://pl.spoj.com/problems/PP0501A/
        int t = scanner.nextInt();
        scanner.nextLine();

        while (t > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            scanner.nextLine();
            System.out.println(NWD(a, b));
            t--;
        }

    }

    static int NWD(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }
}
