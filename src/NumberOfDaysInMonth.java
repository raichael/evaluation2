public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2017));
        getDaysInMonth(5,2018);
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if ((year % 4 == 0)) {
                if ((year % 100 == 0)) {
                    if (year % 400 != 0) {
                        return false;
                    }
                }
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static void getDaysInMonth(int month, int year) {

        if (month == 2) {
            if (isLeapYear(year)) {
                System.out.println("29 days ");
            } else {
                System.out.println("28 days ");
            }
        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            System.out.println("31 days");}
        else {
            System.out.println("30 days");
        }

    }
}
