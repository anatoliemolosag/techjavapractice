package IFStatement;

import java.util.Scanner;

public class NestedIf2 {
    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);

        System.out.println(" whitch languages do you know between java,C# and Phyton ? ");

        String Java = input.nextLine();


        if(Java.equalsIgnoreCase("Java")||Java.equalsIgnoreCase("C#")||Java.equalsIgnoreCase("Phyton")){

            System.out.println("Do you know Selenium");
            String Selenium = input.nextLine();
            if(Selenium.equalsIgnoreCase("Yes")){
                System.out.println("do you know API");
                String API = input.nextLine();
                if (API.equalsIgnoreCase("Yes")){
                    System.out.println("Do you know SQL");
                    String SQL = input.nextLine();
                    if(SQL.equalsIgnoreCase("Yes")){
                        System.out.println("Congrats! You got the Job");

                    }else{
                        System.out.println("we need SQL knowlage");
                    }

                }else{
                    System.out.println("we need somene who know API");
                }

            }else{
                System.out.println("we need someone who know selenium");
            }
        }else{
            System.out.println("Please learn java and try again");
        }




    }
}
/*
Lets say there is a candidate for a job interview and s/he will be asked abut java, selenium, API, SQL knowledge
first ask candidate if s/he knows java
  if s/he says 'yes' --> ask about selenium knowledge
    if s/he says 'yes' --> ask about API testing
      if s/he says 'yes' --> ask about SQL knowledge
       "Congrats! You are hired"
        if s/he says 'no' --> we need SQL knowledge
      if s/he says 'no' --> "We need API knowledge"
    if s/he says 'no' --> "We need selenium skills"
  if s/he says 'no' --> "please learn java and try again"
-----------------------------------------------------------
 */