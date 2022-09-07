package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int num1 = 0, num2 = 1, helper;
        System.out.println(0);
        System.out.println(1);
        for (int i = 0; i < lastFibonacci - 2; i++){
            helper = num2;
            num2 = num1 + num2;
            num1 = helper;
            System.out.println(num2);
        }
    }
}
