public class EvenDigitSum {
    public static void main(String[] args){
        System.out.println(getEvenDigitSum(132478));
    }
    public static int getEvenDigitSum(int number){
        int sum = 0;
        int remainder=0;
        if(number>0){
            while (number!=0){
                remainder = number%10;
                if(remainder%2==0){
                    sum = sum+remainder;
                }
                number=number/10;
            }
            return sum;
        }
        return -1;}
    }

