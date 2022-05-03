package AccessModifiers;

public class test {
    public static void main(String[] args) {

        //   Animal cat1 = new Animal("Fluffy","white","F"); --> you cannot reach PRIVATE constructor from different class
        Animal cat1 = new Animal("Fluffy", "white"); // DEFAULT CONSTRUCTOR --> same package
    }

    }
