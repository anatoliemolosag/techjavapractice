package Objects.ObjectsHomePractice;

public class remoteControl {

    String color ="black";
    double weight ;
    double length ;
    double width ;
    int upDown=0;
    int leftRight=0;

    public double size(){
      length=6.2;

      width=3.0;
      double totalSize= length+width;
        System.out.println(totalSize);
        return totalSize;

    }
    public void up(){
        upDown++;
        System.out.println("one canal ahead "+upDown);

    }
    public void down(){
        upDown--;
        System.out.println("one canal behind "+upDown);

    }
    public void left(){
        System.out.println("previous page");

    }
    public void right(){
        System.out.println("next page");
    }

    public static void main(String[] args) {
        remoteControl obj = new remoteControl();
        obj.size();
        obj.up();
        obj.down();
        obj.left();
        obj.right();
    }

}
