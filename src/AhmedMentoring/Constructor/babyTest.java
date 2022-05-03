package AhmedMentoring.Constructor;

public class babyTest {
    public static void main(String[] args) {


        Baby juniorAhmet = new Baby();


        juniorAhmet.name="Ashley";
        juniorAhmet.gender="boy";
        juniorAhmet.eyeColor="brown";
        juniorAhmet.height=1.4;
        juniorAhmet.weight=15;
        juniorAhmet.brainCapacity=100;

        System.out.println(juniorAhmet.name);//Ahley
        System.out.println(juniorAhmet.gender);//boy
        System.out.println(juniorAhmet.eyeColor);//brown
        System.out.println(juniorAhmet.height);//1.4
        System.out.println(juniorAhmet.weight);//15.0
        System.out.println(juniorAhmet.brainCapacity);//100

        Baby latestBaby = new Baby("Lisa","girl",5,1.5,"blue",100);
        System.out.println(latestBaby.name);
        System.out.println(latestBaby.gender);
        System.out.println(latestBaby.eyeColor);
        System.out.println(latestBaby.height);
        System.out.println(latestBaby.weight);
        System.out.println(latestBaby.brainCapacity);










//        Baby seniorAhmed =new Baby("boy");
//        System.out.println(seniorAhmed.gender);//boy
//
//
//        Baby mixAhmed =new Baby(12,1.2);
//        System.out.println(mixAhmed.weight);//12
//        System.out.println(mixAhmed.height);//1.2
        //mixAhmed.weight=12;
        //mixAhmed.height=1.2;

    }
}