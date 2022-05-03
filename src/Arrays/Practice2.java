package Arrays;

import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        String[] studenTnames = new String[10];
        System.out.println(Arrays.toString(studenTnames));//default values
        studenTnames[1]= "Alex";
        studenTnames[2]="David";
        studenTnames[8]="****";
        studenTnames[5]="Tima";
        System.out.println(Arrays.toString(studenTnames));//[null, Alex, David, null, null, Tima, null, null, ****, null]
        studenTnames[8]="Ana";
        System.out.println(Arrays.toString(studenTnames));//[null, Alex, David, null, null, Tima, null, null, Ana, null]


        studenTnames[0]="123";
        studenTnames[1]="true";
    for(int index = studenTnames.length-1; index>-1; index--){
        System.out.println(studenTnames[index]);
    }

    }
}
