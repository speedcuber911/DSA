import java.util.Scanner;

public class ByteLandian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            long n = sc.nextLong();

            System.out.println(getMaxVal(n));
        }

    }

    public static long getMaxVal(long n) {
        if (n < 12)
            return n;

        else
            return Math.max(n, getMaxVal(n / 2) + getMaxVal(n / 3) + getMaxVal(n / 4));

    }
}
