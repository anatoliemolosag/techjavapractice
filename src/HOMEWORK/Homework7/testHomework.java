package HOMEWORK.Homework7;

public class testHomework {

    int hour;
    int minute;
    int second;
    int month;
    int year;
    public String season (int month){

        if(month==12){
            System.out.println(month + "->December is Winter");
            return month + "->December is Winter";
        }
        if(month==11) {
            System.out.println(month+"->November is Fall");
            return month+"November is Fall";
        }
        if(month==10){
            System.out.println(month+"->October is Fall");
            return month+"->October is Fall";

        }if(month==9)
        {
            System.out.println(month+"->September is Fall");
            return month+"->September is Fall";
        }
        if(month==8){
            System.out.println(month+"->August is Summer");
            return month+"->August is Summer";
        }
        if (month==7){
            System.out.println(month+"->July is Summer");
            return month+"->July is Summer";
        }
        if(month==6){
            System.out.println(month+"->June is Summer");
            return month+"->June is Summer";
        }
        if(month==5){
            System.out.println(month+"->May is Spring");
            return month+"->May is Spring";
        }
        if(month==4){
            System.out.println(month+"->April is Spring");
            return month+"->April is Spring";
        }
        if(month==3){
            System.out.println(month+"->March is Spring");
            return month+"->March is Spring";
        }
        if(month==2){
            System.out.println(month+"->February is Winter");
            return month+"->February is Winter";
        }
        if(month==1){
            System.out.println(month+"->January is Winter");
            return month+"->January is Winter";
        }
        System.out.println("No Season Found");
        return "No Season Found";


    }

    public static void main(String[] args) {
        testHomework obj = new testHomework();
        obj.season(6);
    }


    /*
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

     */
}
