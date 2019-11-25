
import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int [] mas = {56, 66, 514, 6716, 56567};

        boolean isSorted = false;
        int g;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] < mas[i+1]){
                    isSorted = false;

                    g = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = g;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}
