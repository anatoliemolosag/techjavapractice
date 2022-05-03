package Loops.For;

public class NestedForClock {
    public static void main(String[] args) {
        //create a digital clock that shows the time as :
        //0:1
        //0:2
        //0:3
        //...
        //11:59
        for (int t = 0;t<=1;t++){
            for(int hour = 0 ; hour<12 ; hour++){
                for (int minutes = 0; minutes<60;minutes++){
                    for (int seconds = 0; seconds<60;seconds++){
                        if(t==0){
                            System.out.println("time is " + hour + ":" + minutes + ":" + seconds + "AM");

                }else {
                        System.out.println("time is " + hour + ":" + minutes + ":" + seconds + "PM");

                    }

                }

               }
           }

            }
        }
    }

