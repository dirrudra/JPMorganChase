public class IntPairOps {
    public static boolean canConvert(int a, int b, int c, int d) {
        if (a == c && b == d) {
            return true;
        }
        if (a > c || b > d) {
            return false;
        }
        return canConvert(a + b, b, c, d) || canConvert(a, a + b, c, d);
    }

    public static void main(String[] args) {
        int a = 1, b = 1, c = 3, d = 4;
        System.out.println(canConvert(a, b, c, d));
    }
}
