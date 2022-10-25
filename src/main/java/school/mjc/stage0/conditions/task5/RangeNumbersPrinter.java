package school.mjc.stage0.conditions.task5;

public class RangeNumbersPrinter {
    public static void main(String[] args) {
        printRange(3);
        printRange(6);
        printRange(15);
        printRange(-2);
    }
    public static void printRange(int number) {
        switch (number) {
            case (1):
            case (2):
            case (3):
            case (4):
            case (5):
                System.out.println("number is between 1 and 5");
                break;
            case (6):
            case (7):
            case (8):
            case (9):
            case (10):
                System.out.println("number is between 6 and 10");
                break;
            default:
                System.out.println("out of range");
                break;
        }
    }
}
