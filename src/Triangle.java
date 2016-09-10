/**
 * Created by Robin on 09/09/2016.
 */
public class Triangle {


    public void printAsterisk() {
        System.out.print("*");
    }

    private void printSpacesHorizontally (int i){
        for (int x = 1; x <= i; x++ ) {
            System.out.print(" ");
        }
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

    public void printRightAngle(int i){
        for (int x = 1; x <= i; x++ ) {
           printHorizontalLine(x);
            System.out.print("\n");
        }
    }

    public void printIsosceles(int i){
        int numSpaces = i-1;
        for (int x = 1; x <= i; x++){
            printSpacesHorizontally(numSpaces);
            numSpaces--;
            int numAsterisk;
            numAsterisk = (2*x-1);
            printHorizontalLine(numAsterisk);
            System.out.print("\n");
        }
    }

}
