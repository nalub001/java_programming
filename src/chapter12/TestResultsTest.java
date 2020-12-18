package chapter12;

import java.util.HashMap;
import java.util.Map;

public class TestResultsTest {

    public static void main(String[] args){

        TestResults test = new TestResults();
        Map<String, Integer> makeupResults = test.getMakeUpGrades();

        Map<String,Integer> originalResults = test.getOriginalGrades();

        Map<String, Integer> finalResults = new HashMap<>();

        for(var entry : originalResults.entrySet()){
            //System.out.println(entry.getKey() + " "+ entry.getValue());
            for(var entry1 : makeupResults.entrySet()){
                //System.out.println(entry1.getKey() + " "+ entry.getValue());
                if(entry.getKey() == entry1.getKey()){
                    if(entry.getValue() > entry1.getValue())
                        finalResults.put(entry.getKey(), entry.getValue());
                    else
                        finalResults.put(entry.getKey(), entry1.getValue());
                }
            }
        }

        finalResults.forEach(
                (k,v)->System.out.println("Name: "+k+ ", Final Grade: "+v)
        );
    }
}
