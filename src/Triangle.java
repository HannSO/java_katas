/**
 * Created by Robin on 09/09/2016.
 */
public class Triangle {


    public void printAsterisk() {
        System.out.print("*");
    }

    public void printHorizontalLine(int i) {
        for (int x = 1; x <= i; x++ ){
            printAsterisk();
        }
    }

    public void printVerticalLine(int i) {
        for (int x = 1; x <= i; x++ ) {
            System.out.println("*");
        }
    }
}
