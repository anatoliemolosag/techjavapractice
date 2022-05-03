package OOP.Polymorphism;


    class Animal{

        public static void animalSound(){
            System.out.println("Animal make sound");
        }  }

    class Dog extends Animal{

        public static void animalSound(){
            System.out.println("bark");
        }
    }

    class Pig extends Animal{

        public  static  void animalSound(){
            System.out.println("pig says oink");
        }

        public static void main(String[] args) {

        }


    }
