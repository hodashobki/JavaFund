import java.util.*;

public class ExceptionsList {
    static ArrayList myList = new ArrayList<>();
    public static void main(String[] args) {
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        // for(int i = 0; i < myList.size(); i++) {
        //     Integer castedValue = (Integer) myList.get(i);
        // }
        for(int i = 0; i < myList.size(); i++) {
            try {
                int castedValue = (Integer) myList.get(i);
            }
            catch(ClassCastException exception){
                exception.printStackTrace();
                System.out.println("Exception: " + myList.get(i));
            }
        }
    }
}