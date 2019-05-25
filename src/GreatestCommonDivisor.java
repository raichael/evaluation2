public class GreatestCommonDivisor {
    public static void main(String[] args)
    {
        System.out.println(getGreatestCommonDivisor(12,30));

    }

    public static int getGreatestCommonDivisor(int first, int second) {
        int lastdiv = -1;
        if (first > 10 && second > 10) {
            int x = Math.max(first, second);
            for (int i = 1; i <= x; i++) {
                if ((first % i == 0) && (second % i == 0)) {
                    lastdiv = i;
                }
            }
        }
        return lastdiv;
    }
}