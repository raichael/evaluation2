public class NumberPalindrome {
    public static void main(String[] args){
        System.out.println(isPalindrome(12121));
    }
    public static boolean isPalindrome(int num){
        int reverse = 0;
        int temp = num;
        while(num>0){
            int reminder = num%10;
            reverse = (reverse*10) + reminder;
            num = num/10;
        }
        if(temp==reverse)
        {
            return true;
        }
        else {
            return false;
        }
    }
}


