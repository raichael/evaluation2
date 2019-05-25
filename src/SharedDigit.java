public class SharedDigit {
    public static void main(String[] args){
        System.out.println(hasSharedDigit(15,55));
    }
    public static boolean hasSharedDigit(int digit1,int digit2 ){
        if((digit1>=10 && digit1<=99) && (digit2>=10 && digit2<=99)) {
            int a, b, c, d;
            a = digit1 % 10;
            b = digit2 % 10;
            c = digit1 / 10;
            d = digit2 / 10;

            if ((a == b) || (c ==d) || (a == d) || (b == c)){
                return true;
            }
            else{
                return false;
            }
        }else{
            return false;
        }
    }

}