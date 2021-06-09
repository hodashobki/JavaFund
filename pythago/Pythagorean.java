import java.lang.Math ;

public  class Pythagorean {

 public static double calculateHypotenuse(int legA, int legB) {

    double hyposquare=  Math.sqrt((legA * legA ) + (legB * legB));
    return hyposquare;
    }
}