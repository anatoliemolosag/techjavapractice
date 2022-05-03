package Objects.ObjectsHomePractice;

public class Pen {

    String type ="gel";                    //atributes
    String color ="blue";                  //atributes
    int point =10;                         //atributes

    static boolean clicked =false;

    public static void click(){
        clicked=true;                       //actions

    }
    public static void unclick(){
        clicked=false;                      //actions
    }

    public static void main(String[] args) {
        Pen p =new Pen();
        System.out.println(p.color);
        System.out.println(p.point);
        System.out.println(p.type);

        System.out.println(p.clicked);//false
        p.click();
        System.out.println(p.clicked);//true



    }


}
