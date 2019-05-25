import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args){
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage()
    {
        Scanner scan=new Scanner(System.in);
        int total=0,count=0;
        System.out.println("Enter the values");
        while(scan.hasNextInt())
        {

            int value=scan.nextInt();
            total+=value;
            count++;
        }
        if(count>0)
        {
            int value=total/count;
            System.out.println("SUM = "+(int)total+" "+"AVG = "+Math.round(value));
        }
        else
            System.out.println("SUM = "+(int)total+" "+"AVG = 0");

    }
}
