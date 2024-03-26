import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BigFibo {

    static Map<Long, Long> F = new HashMap<>();
    static final long M = 1000000007; // modulo

    static long f(long n) {
        if (F.containsKey(n)) return F.get(n);
        long k = n / 2;
        if (n % 2 == 0) { // n=2*k
            return F.put(n, (f(k) * f(k) + f(k - 1) * f(k - 1)) % M);
        } else { // n=2*k+1
            return F.put(n, (f(k) * f(k + 1) + f(k - 1) * f(k)) % M);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n;
        F.put(0L, 1L);
        F.put(1L, 1L);
        while (scanner.hasNextLong()) {
            n = scanner.nextLong();
            System.out.println(n == 0 ? 0 : f(n - 1));
        }
    }
}
