import java.util.*;

class MinMaxCalculation {

    public static void main(String args[]) {
        int a[] = {11, 18, 3, 5, 1};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int x : a) {
            if(x > max)
                max = x;
            if(x < min)
                min = x;
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}