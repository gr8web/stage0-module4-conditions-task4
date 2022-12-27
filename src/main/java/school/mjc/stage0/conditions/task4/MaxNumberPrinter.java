package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        if (first > second && first > third) {
            System.out.println(first);
            return;
        }
        if (second > first && second > third) {
            System.out.println(second);
            return;
        }
        if (third > first && third > second) {
            System.out.println(third);
            return;
        }
        System.out.println(first);
    }
}
