import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class PuzzleJava{
    public void Create(int[]arr){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        
        // numbers.add(3);
        // numbers.add(5);
        // numbers.add(1);
        // numbers.add(2);
        // numbers.add(7);
        // numbers.add(9);
        // numbers.add(8);
        // numbers.add(13);
        // numbers.add(25);
        // numbers.add(32);
        int sum=0;
        for(int i=0; i<arr.length;i++){
             sum += arr[i];
            if (arr[i]>10){
                numbers.add(arr[i]);
            }

        }
       System.out.println(sum);
       System.out.println( numbers);
      
    }

    // ****************
    public void shuffling(String[] arr){
        ArrayList<String> newarray = new ArrayList<String>();
        ArrayList<String> newarray1 = new ArrayList<String>();  
        for(int i = 0; i < arr.length; i++){
            if(arr[i].length() > 5){
                newarray1.add(arr[i]);
            }
            newarray.add(arr[i]);
        }
        Collections.shuffle(newarray);
        System.out.println(newarray);
        System.out.println(newarray1); 

    }
// **************
public void shuffleAlphabet(){
    ArrayList<String> alphaArr = new ArrayList<String>();
    for(char alpha = 'A'; alpha <= 'Z'; alpha++){
        alphaArr.add(Character.toString(alpha));
    }
    System.out.println(alphaArr);
    Collections.shuffle(alphaArr);
    System.out.println(alphaArr);

    System.out.println("First letter : " + alphaArr.get(0));
    System.out.println("Last letter : " + alphaArr.get(25));
    String letter = alphaArr.get(0);

    if("AEIOU".indexOf(letter) > 0){
        System.out.println("The first letter is vowel!");
    }   
}
public void randNumber2(){
    ArrayList<Integer> randNums2 = new ArrayList<Integer>();
    int min = 101;
    int max = 55;
    for(int i = 0; i < 10; i++){
        int num2 = ThreadLocalRandom.current().nextInt(55, 101);
        randNums2.add(num2);
        if(num2 < min){
            min = num2;
        }
        if(num2 > max){
            max= num2;
        }
    }
    Collections.sort(randNums2);
    System.out.println(randNums2);
    System.out.println("Smallest randomized number is: " + min);
    System.out.println("Largest randomized number is: " + max);
}

public void randomString(){
    Random rand = new Random();
    StringBuilder randString = new StringBuilder();
    String alphaNumeric = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    for(int i = 0; i < 5; i++){
        randString.append(alphaNumeric.charAt(rand.nextInt(alphaNumeric.length())));
    }
    String finalString = randString.toString();
    System.out.println(finalString);
}

public void randomStringOfStrings(){
    Random rand = new Random();
    StringBuilder randString = new StringBuilder();
    ArrayList<String> randList = new ArrayList<String>();
    String alphaNumeric = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    for(int i = 0; i <10; i++){
        for(int j = 0; j < 5; j++){
            randString.append(alphaNumeric.charAt(rand.nextInt(alphaNumeric.length())));
        }
        String finalString = randString.toString();
        randList.add(finalString);
        randString.setLength(0);
    }
    System.out.println(randList);
} 

}