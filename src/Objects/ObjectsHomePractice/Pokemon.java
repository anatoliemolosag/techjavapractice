package Objects.ObjectsHomePractice;

public class Pokemon {

    String name ;
    int level ;

    public int Pokemon1(){
        name= "Pikachu";
        int level1=5;
        int level2=7;
        int sumOfLevels=level1+level2;
        System.out.println(sumOfLevels);
        return sumOfLevels;



    }
    public void Pokemon2(){
        name="lulu";
        level=20;
        System.out.println(name+" \n"+level);

    }

    public void Pokemon1and2(){


    }

    public static void main(String[] args) {
        Pokemon obj = new Pokemon();
        obj.Pokemon1();



    }



    }

