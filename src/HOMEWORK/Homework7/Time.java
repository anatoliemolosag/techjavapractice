package HOMEWORK.Homework7;

public class Time {

    int hour;
    int minute;
    int second;
    int month;
    int year;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time(int month, int year) {
        this.month = month;
        this.year = year;
    }

    public Time(int hour, int minute, int second, int month, int year) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.month = month;
        this.year = year;
    }

    //Part2

    public int getHour(){

        return hour;
    }
    public int getMinute(){
        return minute;

    }
    public int getSecond(){
        return second;

    }
    public int getMonth(){

        return month;
    }
    public int getYear(){

        return year;
    }
    public void setHour(int hour){
        if(hour<0||hour>24){
            hour = 0;
        }
       this.hour = hour;

    } public void setMinute(int minute){
        if(minute<0&&minute>60){
            minute=0;
        }
   this.minute=minute;
    }
    public void setSecond(int second){
        if(second<0&&second>60){
            second=0;
        }
    this.second=second;
    }
    public void setMonth(int month){
        if(month<0&&month>12){
            month=0;
        }
       this.month=month;
    }
    public void setYear( int year){
        if(year<0){
            year=0;
        }
    this.year=year;
    }


    public String amPm(int hour) {
        if(hour>24 || hour<0){
            return null;
        }
        if (hour < 12) {

            return "am";
        } else {

            return "pm";
        }
    }

    public static String season (int month){
        if(month==12 || month==1 || month ==2) {

            return "Winter";
        }
        if(month>=3 && month<=5) {

            return "Spring";
        }
        if(month>=6 && month<=8){

            return "Summer";
        }if(month>=9 && month<=11)
        {

            return "Fall";
        }

        return "No Season Found";

    }
    public String timeInfo(){


        return hour+":"+minute+":"+second;
    }
    public String date(){

        return month+"/"+year;
    }

    @Override
    public String toString() {

        return  hour +":"+minute+":"+second + " - " + month + "/"+year;
    }


    public static void main(String[] args) {
        Time obj = new Time(10,30,29,12,22);
//        obj.amPm(13);
//        obj.season(3);
//        obj.timeInfo();
//        obj.date();
       // System.out.println(obj);
        obj.toString();
        obj.amPm(12);
       // System.out.println(obj.amPm(12));



    }

    /*
    * There is a class named Time on the LEFT SIDE.
            *  PART 1
            * The class needs to have 5 (int) INSTANCE VARIABLES with the names  hour, minute, second, month, and year.

!!!!  -> (Please use the right names and int data type for all variables. ) <- !!!!

    Write the following constructors:

            1- Create the three-arguments constructor to set the values for (1)hour, (2)minutes, and (3)second

2- Create a two-arguments constructor to set the values for (1)month and (2)year

3- Create five arguments constructor to set the values for (1)hour, (2)minutes, (3)second, (4)month, and (5)year.

    PART 2
            1- Create one method named getHour. This method needs to return the hour from the instance field.
            2- Create one method named getMinute. This method needs to return the minute from the instance field.
            3- Create one method named getSecond. This method needs to return the second from the instance field.
            4- Create one method named getMonth. This method needs to return the month from the instance field.
            5- Create one method named getYear. This method needs to return the year from the instance field.

    PART 3
            - 1 Create one method named setHour, it needs to set the value of the hour field.
    If the value of the hour is less than 0 or more than 24, the value of the hour must set to 0.

            2- Create one method named setMinute, it needs to set the value of the minute field.
    If the value of the minute is less than 0 and more than  60, the value of the minute must set to 0.

            3- Create one method named setSecond, it needs to set the value of the second field.
    If the value of the second is less than 0 and more than  60, the value of the second must set to 0.

            4- Create one method named setMonth, it needs to set the value of the Month field.
    If the value of the Month is less than 0 and more than  12, the value of the Month must set to 0.

            5- Create one method named setYear it needs to set the value of the Year field.
    If the value of the year is less than 0, the value of the Year must set to 0.

            (REGULAR SET METHOD RULES APPLY HERE TOO LIKE NO RETURN TYPE ONE PARAMETER)

    PART 4
            1- Create one method named amPm that will take one int parameter as the hour value,
this method will return "am" or "pm" according to the hour.
    If the hour is before 12, it will print am. If the hour is after 12 or 12 it will print the pm.

2- Create one method named season that will take the month number as parameter and
    will return the season name according to the month.
            ( **12 ->December, 1-> January, and 2-> February is Winter**
            **3->March, 4->April, and 5->May is Spring**
            **6->June, 7->July, and 8->August is Summer**
            **9->September, 10->October, and 11->November is Fall**
            )
    If the value of the month is bigger than 12 or less than equals to 0 you should return text below
"No Season Found"

        ***********************************************************************************************************

        -> The methods below won't take parameter and they will only use instance variables in the class<-

            3- Create one method named timeInfo to return Time information as String (Text Format : hour:minute:second)
    For example if the value of hour is 10 and value of minute is 22 and value of second is 50
    you should return 10:22:50

            4- Create one  method named date to return date information as String (Text format: month/year)
    For Example: If the value of year is 21 and value of month is 9
    it should return 9/21

            5- Create toString method to print all object(Time and Date information) in giving format: hh:mm:ss - mm/yyyy)
    For Example:
            if the value of hour is 10 and value of minute is 22 and value of second is 50
    andhe value of year is 21 and value of month is 9 it should return   "10:22:50 - 9/21"


    GOOD LUCK AND IF THE TEST DOESN'T PASS PLEASE LOOK THE OUTPUT IT WILL TELL YOU THE MISTAKE.

    YOU DO NOT NEED A SCANNER, MAIN METHOD.  YOU ONLY NEED METHODS AND INSTANCE VARIABLES THAT ARE ASKED
    ABOVE AND ALL
    IMPLEMENTATION WILL BE IN Time.java.

     */



}
