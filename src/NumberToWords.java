public class NumberToWords {
    public static void main(String[] args) {
        System.out.println(getDigitCount(1010));
        System.out.println(Reverse(1010));


    }

    public static int getDigitCount(int number) {
        int value, count = 0;
        while (number > 0) {
            value = number % 10;
            number = number / 10;
            count++;
        }
        return count;
    }

    public static int Reverse(int number) {
        int value;
        int rev = 0;
        while (number > 0) {
            value = number % 10;
            rev = (rev * 10) + value;
            number = number / 10;
        }
        numbersToWords(rev);
        return rev;

    }

    public static void numbersToWords(int rev) {
        int value;
        int sum = 0;
        while (rev > 0) {
            value = rev % 10;
            System.out.println(numInWords(value));
            sum = (sum * 10) + value;
            rev = rev / 10;
        }
    }

    public static String numInWords(int number) {
        switch (number) {
            case 0:
                return "ZERO";
            case 1:
                return "ONE";
            case 2:
                return "TWO";
            case 3:
                return "THREE";
            case 4:
                return "FOUR";
            case 5:
                return "FIVE";
            case 6:
                return "SIX";
            case 7:
                return "SEVEN";
            case 8:
                return "EIGHT";
            case 9:
                return "NINE";
            default:
                return "INVALID VALUE";
        }
    }
}