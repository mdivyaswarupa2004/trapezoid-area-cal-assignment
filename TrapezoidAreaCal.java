public class TrapezoidAreaCal {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int divisionByTwo(int number) {
        return number / 2;
    }

    public static void main(String[] args) {
        System.out.println("Trapezoid Area Calculator");

        int result = add(4, 6);
        System.out.println("4 + 6 = " + result);

        result = divisionByTwo(result);
        System.out.println("10 / 2 = " + result);
    }
}
