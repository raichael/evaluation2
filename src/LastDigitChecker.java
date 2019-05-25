public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(9, 99, 999));
        System.out.println(isValid(10));
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (isValid(num1) && isValid(num2) && isValid(num3)) {
            int digit1 = num1 % 10;
            int digit2 = num2 % 10;
            int digit3 = num3 % 10;
            if ((digit1 == digit2) || (digit2 == digit3) || (digit1 == digit3)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean isValid(int num) {
        {
            if (num >= 10 && num <= 1000) {
                return true;
            } else {
                return false;
            }
        }
    }
}


