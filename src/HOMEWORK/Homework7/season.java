package HOMEWORK.Homework7;

import javax.crypto.spec.PSource;

public class season {

    public String season (int month){

        switch (month){
            case 12:
            case 1:
            case 2:
                return "Winter";
            case 3:
            case 4:
            case 5:
                return "Spring";
            case 6:
            case 7:
            case 8:
                return "Summer";
            case 9:
            case 10:
            case 11:
                return "Fall";
            default:
                return "No season found";
        }

    }

    public static void main(String[] args) {

        season obj = new season();
        obj.season(11);
        System.out.println(obj.season(13));

    }


}
