package AhmedMentoring.Overriding;

public class add {

    int solution(int a,int b){
        System.out.println(a+b);
        return a+b;
    }
}
class multi extends add{

   @Override
    int solution(int a, int b) {
        System.out.println(a*b);
        return a*b;
    }
}

class Demo {

    public static void main(String[] args) {
        add obj1 = new add();
        add obj2 =new multi();

        obj1.solution(3,5);
        obj2.solution(3,5);


    }
}