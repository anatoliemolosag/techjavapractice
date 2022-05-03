package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StudentInfo {
    public static void main(String[] args) {


        HashMap<String, String> student1 = new HashMap<>();
        HashMap<String, String> student2 = new HashMap<>();
        HashMap<String, String> student3 = new HashMap<>();
        HashMap<String, String> student4 = new HashMap<>();

        student1.put("FirstName" , "David");
        student1.put("Lastname", "Pena");
        student1.put("Age", "25");
        student1.put("gender", "male");
        student1.put("cities", "Chicago");

        student2.put("FirstName", "Jeremiah");
        student2.put("LastName", "Michaelson");
        student2.put("Age", "15");
        student2.put("Gender", "M");
        student2.put("City", "LakeForest");

        student3.put("FirstName", "Michael");
        student3.put("LastName", "White");
        student3.put("Age", "35");
        student3.put("Gender", "M");
        student3.put("City", "Winnetka");

        student4.put("FirstName", "Sarah");
        student4.put("LastName", "Star");
        student4.put("Age", "29");
        student4.put("Gender", "F");
        student4.put("City", "Chicago");


        ArrayList<HashMap<String,String>> studentList =new ArrayList<>();

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        System.out.println(student4);;
        System.out.println(studentList);//result will come as list of maps

        //print every Student one at a time

        for (Map<String,String> studentL : studentList){
            //System.out.println(studentL);

        }

        //show the names of the students who live in Chicago


        for (Map<String,String> studentL : studentList){

            if(studentL.containsValue("Chicago")) {
                System.out.println(studentL.get("FirstName")+ " is living in chicago");
            }
        }

        //show last name of students which age are less than 25

        for (Map<String,String> studentL : studentList){

           if(Integer.parseInt(studentL.get("Age"))<=25){
               System.out.println((studentL.get("FirstName").toUpperCase() + " " + studentL.get("Lastname")).toUpperCase());
            }
        }


    }
}
/*
====Task:===========

store studentInfo in map(s)
store student information a list
StudentInfo
-------------
FirstName: David
LastName: Pena
Age: 25
Gender: M
City: Chicago
FirstName: Jeremiah
LastName: Michaelson
Age: 15
Gender: M
City: LakeForest
FirstName: Michael
LastName: White
Age: 35
Gender: M
City: Winnetka
FirstName: Sarah
LastName: Star
Age: 29
Gender: F
City: Chicago
 */