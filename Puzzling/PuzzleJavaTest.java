import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class PuzzleJavaTest{
    public static void main(String[] args){
        PuzzleJava summ=new PuzzleJava();
        int[] newsArr = {3,5,1,2,7,9,8,13,25,32};
        summ. Create(newsArr);
       
        // PuzzleJava summ=new PuzzleJava();
        // summ=summ.Create();
        PuzzleJava testarray1=new PuzzleJava();   
        String[] testarray = {"Nancy", "Jinichi","Fujibayashi", "Momochi", "Ishikawa"};
        testarray1.shuffling(testarray);
        //   ************
        PuzzleJava testData=new PuzzleJava(); 
        testData.shuffleAlphabet();
            // *******
        // PuzzleJava testData2=new PuzzleJava(); 
        // testData1.randNumber();
        // **************
        PuzzleJava testData2=new PuzzleJava(); 
        testData2.randNumber();
        // **************
        PuzzleJava testData3=new PuzzleJava(); 
        testData3.randomString();
        // ******************
        PuzzleJava testData4=new PuzzleJava(); 
        testData4.randomStringOfStrings();

    }
}