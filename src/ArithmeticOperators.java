public class ArithmeticOperators {
    public static void main(String[] args) {
        int x = 10;
        int y = 12;
        int z = 3;
        x += y - x++ * z;
        System.out.println("x += y - x++ * z = " + x);

        // x = -8; y = 12; z = 3;
        z = --x - y * 5;
        System.out.println("z = --x –y * 5 = " + z);

        // x = -9; y = 12; z = -69;
        y /= x + 5 % z;
        System.out.println("y /= x + 5 % z = " + y);

        // x = -9; y = -3; z = -69;
        z = x++ + y * 5;
        System.out.println("z = x++ + y * 5 = " + z);

        // x = -8; y = -3; z = -24;
        x = y - x++ * z;
        System.out.println("x = y - x++ * z = " + x);

    }
}
