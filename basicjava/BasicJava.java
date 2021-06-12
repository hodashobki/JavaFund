import java.util.Arrays;
import java.util.ArrayList;
public class BasicJava{
    // Print 1-255
    public void printnumbers(int x,int number){
        for (int i = x; i < number; i++){
            System.out.println(i);
        }
    }

    public int PrintSum(int x, int number){
        int sum=0;
        for (int i = x; i < number; i++){
            sum +=i;
        }
        return sum;

    }

    // Iterating
    public void IteratingArray(int[] myArray){
        for (int i=0;i<myArray.length;i++){
            System.out.println(i);

        }

    }

    // Find Max
    public int FindMax(int[] myArray){
        int max=myArray[0];
        for (int i=0;i<myArray.length;i++){
            
            if (myArray[i]>max){
                max= myArray[i];
            } 
        }
        return max;
    }

    // Get Average
    public double GetAverage(int[] myArray){
        int sum=0;
        // double average=0;
        for (int i=0;i<myArray.length;i++){
            sum+=i;
        }
        double average=sum/myArray.length;
        return  average;

    }

    // Array with Odd Numbers
   

    public ArrayList<Integer> OddNumbers(int x, int number){
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for (int i=x;i<number;i++){
            if(i%2!=0){
                myArray.add(i);  
            }
        }
        return myArray;
    }
    // Greater Than Y
    public int GreaterThanY(int[] array,int y){
        int counter=0;
        for (int i=0;i<array.length;i++){
            if (array[i]>y){
                counter+=1;
            }

        }
        return counter;
    }

    // Square the values
    public int[] SquarValues(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]*arr[i];
        }
        return arr;
    }

    // Eliminate Negative Numbers
    public int[] EliminateNegative(int[]arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                arr[i]=0;
            }
        }
        return arr;
    }

    // MaxMinAverage
    public ArrayList<Object> MaxMinAverage(int[]array){
        ArrayList<Object> myArray = new ArrayList<Object>();
        int max=array[0];
        int min=array[0];
        int sum =0;
        for(int i =0;i<array.length;i++){
            sum+=array[i];
            if (array[i]>max){
                max= array[i];
            } 
            if (array[i]<min){
                min= array[i];
            } 
        }
        double average=sum/array.length;
        myArray.add(max);
        myArray.add(min);
        myArray.add(average);
        return myArray;


    }
    // Shifting the Values in the Array
    // public int[] ShiftingValues(int[array]){
    //     int temp;
    //     for (int i=0;i<array.length;i++){   
    //     temp=array[0];
    //     array[0]=array[(array.length)-1];
    //     array[(array.length)-1]=temp;
        
    //     return array;
    // } 
    //     }
    public int[] ShiftingValues(){
    return new int[]{1, 5, 10, 7, -2};
    }
    
}