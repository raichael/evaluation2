public class SumOdd {
    public static void main(String[] args){
        System.out.println(isOdd(4));
        System.out.println(sumOdd(100,1000));
    }
    public static boolean isOdd(int num)
    {
        if(num>0){
            if(num%2 != 0){
                return true;
            }else
            {
                return false;
            }
        }else
        {
            return false;
        }
    }
    public static int sumOdd(int start, int end){
        int sum = 0;
        if(start>0 && end>=start){
            for(int i = start;i<=end;i++){
                if(isOdd(i)){
                    sum= sum+i;
                }
            }}
        else{
            return -1;
        }
        return sum;
    }
}
