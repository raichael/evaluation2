public class FirstAndLastDigitSum {
    public static void main(String[] args){
        System.out.println(sumFirstAndLastDigit(252));
    }
    public static int sumFirstAndLastDigit(int number){
        int reverse = 0;
        if(number>=0) {
            int ld = number % 10;
            while (number > 0) {
                int reminder = number % 10;
                reverse = (reverse * 10) + reminder;
                number = number / 10;
            }
            int fd = reverse % 10;
            int sum = fd + ld;
            return sum;
        }
        else
        {
            return -1;
        }
    }
}
