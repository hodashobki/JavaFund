public class StringManipulator {
   public String trimAndConcat(String string1, String string2){
       String result=string1.trim()+string2.trim();
       return result;
    }
    
    public Integer getIndexOrNull(String str, char cha){
        Integer result =str.indexOf(cha);
        if (result >0){
            return result; 

        }
        else {
            return null;
        }

        
}
   public Integer getIndexOrNulll(String str, String sub){
        Integer subindex =str.indexOf(sub);
        
        if(subindex >=0){
            return subindex;
        }
        else {
            return null;
        }

    }
   public String concatSubstring(String str1, int in1, int in2, String str2){
        String substr1 = str1.substring(in1,in2);
        String string3 = substr1.concat(str2);
        return string3;


    }
}
