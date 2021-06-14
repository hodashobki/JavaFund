import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

// Create an array with the following values: 3,5,1,2,7,9,8,13,25,32.
//  Print the sum of all numbers in the array. Also have the function 
//  return an array that only includes numbers that are greater than 10
//   (e.g. when you pass the array above, it should
//  return an array with the values of 13,25,32)
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
    // Create an array with the following values: Nancy, Jinichi,
    //  Fujibayashi, Momochi, Ishikawa. Shuffle the array and print the 
    //  name of each person. Have the method also return 
    // an array with names that are longer than 5 characters.

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

// Create an array that contains all 26 letters of the alphabet
//(this array must have 26 values). Shuffle the array and, after
//shuffling, display the last letter from the array. Have it also
// display the first letter of the array. If the first letter 
// in the array is a vowel,
//  have it display a message.

public void shuffleAlphabet(){
    ArrayList<String> alphA = new ArrayList<String>();
    for(char i = 'A'; i <= 'Z';i++){
        alphA.add(Character.toString(i));
    }
    System.out.println(alphA);
    Collections.shuffle(alphA);
    System.out.println(alphA);

    System.out.println("First Character : " + alphA.get(0));
    System.out.println("Last Character : " + alphA.get(25));
    String chara= alphA.get(0);

    if("AEIOU".indexOf(chara) > 0){
        System.out.println("The first Character is vowel!");
    }   
}
// Generate and return an array with 10 random numbers between 55-100.
// To get a random integer, you can use the nextInt method of the
// Random class.
// Random Class documentation
// showing the smallest number in the beginning).
//  Display all the numbers in the array. Next, display the minimum value 
// in the array as well as the maximum value

public void randNumber(){
    ArrayList<Integer> randNums= new ArrayList<Integer>();
    int min = 101;
    int max = 55;
    for(int i = 0; i < 10; i++){
        int num2 = ThreadLocalRandom.current().nextInt(55, 101);
        randNums.add(num2);
        if(num2 < min){
            min = num2;
        }
        if(num2 > max){
            max= num2;
        }
    }
    Collections.sort(randNums);
    System.out.println(randNums);
    System.out.println("Smallest number is: " + min);
    System.out.println("Largest number is: " + max);
}
//  Create a random string that is 5 characters long.
public void randomString(){
     // ArrayList<String> randomString=new ArrayList<string>;
    // byte[] array = new byte[5];
    // new Random().nextBytes(array);
    // String generatedString = new String(array, Charset.forName("UTF-8"));

    Random rand = new Random();
    StringBuilder randString = new StringBuilder();
    String alphaNumeric = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    for(int i = 0; i < 5; i++){
        randString.append(alphaNumeric.charAt(rand.nextInt(alphaNumeric.length())));
    }
    String newString = randString.toString();
    System.out.println(newString);
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