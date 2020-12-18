package chapter12;

import java.util.HashMap;
import java.util.Map;

public class TestResults {

    public Map getOriginalGrades(){
        Map grades = new HashMap();

        grades.put("Angie", 24);
        grades.put("Dave", 80);
        grades.put("Lisi", 90);

        return grades;
    }

    public  Map getMakeUpGrades(){
        Map grades = new HashMap();

        grades.put("Angie", 80);
        grades.put("Dave", 79);
        grades.put("Lisi", 90);

        return grades;
    }
}
