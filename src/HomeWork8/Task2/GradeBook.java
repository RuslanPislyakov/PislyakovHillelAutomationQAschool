package HomeWork8.Task2;

import java.util.HashMap;
import java.util.Set;

public class GradeBook {
    public static void main(String[] args) {

        Set<String> namesOfStudents = TestResult.listOfStudentsNames();
        HashMap<String, Integer> firstTest = TestResult.getOriginalGrades();
        HashMap<String, Integer> secondTest = TestResult.getMakeUpGrades();
        HashMap<String, Integer> gradeBookMap = new HashMap<>();

        for (String name : namesOfStudents) {
            if (firstTest.get(name) >= secondTest.get(name)) {
                gradeBookMap.put(name, firstTest.get(name));
            } else gradeBookMap.put(name, secondTest.get(name));

            System.out.println(name + " " + gradeBookMap.get(name));
        }
    }
}
