package Practice2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ComparableCircle[] comparableCircles = new  ComparableCircle[3];
        comparableCircles[0] = new ComparableCircle(33.6);
        comparableCircles[1] = new ComparableCircle();
        comparableCircles[2] = new ComparableCircle( 4.3, "black", true);
        System.out.println("------Check-----");
        for(ComparableCircle comparableCircle: comparableCircles){
            System.out.println(comparableCircle);
        }
        Arrays.sort(comparableCircles);
        System.out.println("After sorting");
        for(ComparableCircle comparableCircle: comparableCircles){
            System.out.println(comparableCircle);
        }
    }
}
