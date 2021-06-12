import java.util.Arrays;
import java.util.ArrayList;
public class BasicJavaTest{
    public static void main(String[] args){
        BasicJava numbers= new  BasicJava();
        numbers.printnumbers(1,256);

        // ***
        BasicJava sumnumbers= new  BasicJava(); 
        int sumnumber=sumnumbers.PrintSum(1,256);
        System.out.println( sumnumber);
// ***

        BasicJava iterating= new  BasicJava();
        int[] newarray ={4, 8, 8, 5, 9};
        iterating.IteratingArray(newarray);  
// ***
        BasicJava findmax= new  BasicJava();
        int[] newarray1 ={4, 8, 8, 5, 9};
        int findmaxx=findmax.FindMax(newarray1);
        System.out.println(findmaxx);

        // ***
        BasicJava getaverage=new BasicJava();
        int[] newarray2 ={4, 8, 8, 5, 9};
        double average= getaverage.GetAverage(newarray2);
        System.out.println(average);

// **********
       BasicJava oddnumber=new BasicJava();
       ArrayList<Integer> oddnumbers=oddnumber.OddNumbers(1,7);
       System.out.println(oddnumbers);

       // **********
       BasicJava greaterthan=new BasicJava();
       int[]array0={4, 8, 8, 5, 9};
       int greaterthany=greaterthan.GreaterThanY(array0,5);
       System.out.println(greaterthany);

    //    **********************
    BasicJava squar=new BasicJava();
    int[]arr0={1,2,3,4,5,6};
    int[]arr1 =squar.SquarValues(arr0);
    System.out.println(Arrays.toString(arr1));
    


    //    **********************
    BasicJava eliminate=new BasicJava();
    int[] arrr={1,-2,8,-7,-2,3,4};
    int[]elimin=eliminate.EliminateNegative(arrr);
    System.out.println(Arrays.toString(elimin));

    //    **********************
    BasicJava maxminav= new BasicJava();
    int[]arrayy={1,2,3,4,5,6};
    ArrayList<Object> theArray =maxminav.MaxMinAverage(arrayy);
    System.out.println(theArray);

    //    **********************
//     BasicJava shift= new BasicJava();
//     int[]array5={1,2,3,4,5,6};
//     int[]shifting=shift.ShiftingValues(array5);
//     System.out.Println(Arrays.toString(shifting));
BasicJava shift= new BasicJava();
int[] doe=shift.ShiftingValues();
System.out.println(Arrays.toString(doe));


    


    }
}