package occurrences;

import java.util.*;

public class GetOccurrence {

    public static void main(String[] args){
        getOccurrence("geeks for geeks test", 'e');

        Map<Character, Integer> test = countOccurrence("geeeke");

        printMap(test);

    }

    public static int getOccurrence(String input, char search){
        int count = 0;
        for(int i=0; i<input.length(); i++){
            if(input.charAt(i) == search){
                count++;
            }
        }

        //System.out.println("Char: "+search + " occurs "+ count +" times in "+ input);
        return count;
    }

    public static Map<Character, Integer>  countOccurrence(String input){
        Map<Character, Integer> occur = new HashMap<>();

        for(int i = 0; i<input.length(); i++){
            int countOccur = getOccurrence(input, input.charAt(i));
            occur.put(input.charAt(i), countOccur);
            //System.out.println(input.charAt(i)+" "+countOccur);
        }
        return occur;
    }

    public static void printMap(Map<Character, Integer> printPlease){
        for(Map.Entry entry : printPlease.entrySet()){
            System.out.println(entry.getKey() + " "+entry.getValue());
        }
    }
}
