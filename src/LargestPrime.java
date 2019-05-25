public class LargestPrime {
    public static void main(String[] args)
    {
        System.out.println(getLargestPrime(45));

    }
    public static int getLargestPrime(int number)
    {for (int i = number - 1; i >= 1; i--)
    {
        if ((number % i == 0) && (isPrime(i))) {
            return i;
        }
    }
        return -1;
    }

    public static boolean isPrime(int number)
    {
        for (int i = 2; i <= number / 2; i++)
        {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    }


