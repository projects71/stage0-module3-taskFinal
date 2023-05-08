package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int sum = 0;

        while (number != 0) {
            sum = sum * 10 + number % 10;
            number /= 10;
        }

        System.out.println(sum);
    }
}
