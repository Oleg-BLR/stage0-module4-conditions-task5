package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public static void main(String[] args) {
        isLeapYear(2004);
        isLeapYear(2003);
        isLeapYear(1900);
        isLeapYear(2000);
        isLeapYear(2008);
        isLeapYear(2007);
    }

    public static void isLeapYear(int year) {
        int check4 = year % 4;
        int check100 = year % 100;
        int check400 = year % 400;
        switch (check400) {
            case (0):
                System.out.println("leap");
                break;
            default:
                switch (check100) {
                    case (0):
                        System.out.println("not leap");
                        break;
                    default:
                        switch (check4) {
                            case (0):
                                System.out.println("leap");
                                break;
                            default:
                                System.out.println("not leap");
                                break;
                        }
                        break;
                }
                break;
        }
    }
}

