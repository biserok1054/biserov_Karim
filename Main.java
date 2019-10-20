import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        for (int i = 0; i < arr.length; i++)
            System.out.println("b" + i + ":" + arr[i]);

        double[] a;
        a = new double[5];
        a[0] = 0;
        for (int i = 1; i < a.length; i++) {
            a[i] = a[i - 1] + 0.5;
            System.out.println(a[i]);
        }

        boolean[] flags = new boolean[200];
        flags[50] = false;
        flags[40] = true && false;


    }

}
