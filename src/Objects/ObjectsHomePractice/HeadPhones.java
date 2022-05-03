package Objects.ObjectsHomePractice;

public class HeadPhones {

    String charge = "micro usb";
    String[] controls = {"power", "volume", "skip", "play/pause"};
    String color ="Red/black";

    static boolean power = false;
    static int volume =0;
    public static void powerOn(){
        power=true;
        System.out.println(power);

    }
    public static void powerOf(){
        power=false;
        System.out.println(power);
    }
    public static void volumeUp(){
        volume++;


    }
    public static void volumeDown(){
        volume--;
        System.out.println(volume);//1(volume is 1 because we run  volumeDow button and it decreased with one (-1))

    }

    public static void main(String[] args) {
        HeadPhones hd = new HeadPhones();
        hd.powerOn();
        hd.powerOf();
        hd.volumeUp();
        System.out.println(volume);//1(volume is 1 because we run one time volumeUp button)
        hd.volumeUp();
        System.out.println(volume);//2(volume is 2 because we run the second time volumeUp button)
        hd.volumeDown();



    }


}
