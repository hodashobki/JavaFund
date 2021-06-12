import java.util.Arrays;
public class StringMethods{
    public static void main(String[] args){
        String a=" Hello ".trim();
        int b=a.indexOf("a");
        String str="arwa";
        String str1=str.toUpperCase();
        int leng=a.length();
        boolean defenderGuarding = true;
        boolean closeToBasket = true;
        if(defenderGuarding == true) {
            System.out.println("Pass The Ball");
        } else if(closeToBasket == true) {
            System.out.println("Shoot The Ball");
        } else {
            System.out.println("Dribble The Ball");
        }
        int[] myArray={1,2,5,6};

        System.out.println(a);
        System.out.println(b);
        System.out.println(str1);
        System.out.println(leng);
        // Arrays.toString(array) to print the whole array
        System.out.println(Arrays.toString(myArray));
    }
}