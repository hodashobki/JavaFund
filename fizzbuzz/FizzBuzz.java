public class FizzBuzz{
    public String fizzBuzz(int number)  {
        //  Fizz number is divisible by 3,
        //  Buzz if the number is divisible by 5, FizzBuzz if the number is divisible by 3 and 5,
        //  and the number itself for all other cases.
        String result;
        if (number%3==0 && number%5==0){
            result= "FizzBuzz";
            
        }
        else if(number%3==0) {
            result= "Fizz";
            
        } else if(number%5==0) {
            result= "Buzz";
        }else{
            result= String.format("%d",number);
        }
        return result;
    }
   
}
// *string result =fizzBuzz(5)