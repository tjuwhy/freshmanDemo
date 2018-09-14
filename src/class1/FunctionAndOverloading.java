package class1;

public class FunctionAndOverloading {

    public static void main(String[] args) {
        int a = max(1, 2);
        double b = max(1.5, 6.1);
        int c = max(2, 3, 4, 1, 86, 12);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static int max(int a, int b) {
        int result;
        if (a > b) {
            result = a;
        } else {
            result = b;
        }
        return result;
    }

    public static double max(double a, double b) {
        return a > b ? a : b;
    }

    public static int max(int... ints) {
        int result = -2147483648;//int 的范围是-2的31次方到 2的31次方减一
        for (int i : ints) {
            if (i > result) {
                result = i;
            }
        }
        return result;
    }

}
