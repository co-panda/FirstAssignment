/**
 * Created by Yang on 1/23/20.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) { 
        if(array.length > 0){
            return array[0];
        } else {
        System.out.println("The array is empty.");
            return null;
        }
   
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        if(array.length >= 2){
            return array[1];
        }else{
        System.out.println("The array does not have second element.");
            return null;
        }
  
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        if(array.length > 0){
            return array[array.length - 1];
        }else{
        System.out.println("The array does not have last element.");
            return null;
        }
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        if(array.length >= 2){
            return array[array.length - 2];
        }else{
        System.out.println("The array does not have second last element.");
            return null;
        }
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        if (array.length == 0 || array == null){
            return false;
        }else{
            for(String s: array){
                if(s == value){
                    return true;
                } 
            }
        }
        System.out.println("There are not specified value in the array.");
            return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        if (array.length == 0 || array == null){
            return array;
        }else{
            int size = array.length;
            String [] rev = new String[size];
            for (int i = 0; i < size; i++){
                rev[i] = array[size - 1 -  i];
            }
            return rev;
        }
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        
        for (int i = 0; i <= array.length / 2 && array.length != 0; i++ ){
             if(array[i] != array[array.length - i - 1]){
                return false;
             }  
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        if (array.length == 0 || array == null){
            return false;
        }else{
            int index = 0;
            boolean[] charactersTable = new boolean[26];
            for(int i = 0; i < array.length; i++){
                for(int j = 0; j < array[i].length(); j++){
                    if('A' <= array[i].charAt(j) && array[i].charAt(j) <= 'Z'){
                        index = array[i].charAt(j) - 'A';
                    }else if ('a' <= array[i].charAt(j) && array[i].charAt(j) <= 'z'){
                        index = array[i].charAt(j) - 'a';
                    }else{continue;}
                    charactersTable[index] = true;
                }
            }
            for(int i = 0; i <= 25; i++){
                if(charactersTable[i] == false){
                    return false;
                }
              
            }
            return true;
        }
        
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        if (array.length == 0 || array == null){
            return 0;
        }else{
            int count = 0;
            for (String s : array){
                if(s == value){
                    count++;
                }
            }
            return count;
        }
    
    }

    /**
     * @param array array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        if (array.length == 0 || array == null){
            return array;
        }else{   
            String[] newArray = new String[array.length - 1];
            for(int i = 0, j = 0; i < array.length; i++){
                if(array[i] == valueToRemove){
                    continue;
                }
                newArray[j++] = array[i];
            }
            return newArray;
        }
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
