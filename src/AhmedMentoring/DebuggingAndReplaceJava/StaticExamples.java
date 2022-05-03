package AhmedMentoring.DebuggingAndReplaceJava;

public class StaticExamples {

    /*
    Possible interview questions

    1) - What is static as a keyword and why do you use it ?
    Static(as a keyword) is a way to make accessible the methods or variables from other places without Creating an
    object

    **The advantages of having static keyword is that you do not need to create an object to access variables or methods

    **The dissadvantage of having a static keyword is that you cannot override the methods  once you call it.(main method is also
    static but it seem you can not override it but actually it is **overHiding**
    *The disadvatage of having static keyword , you cannot call the static methods or variables inside of non-static methods

    2) What is static block
    *Is a block that can be called once (1 time it works )
    *it is always executed first


    3)What is static variables
    *it makes the variables belongs to the class
    *It's shareable (changeable) -- > common for each object
    *it can be accessed by other classes without creating an object


    $)What is instance block?
    * IS a block that can be called as many as you have objects

     */
    static int food =20;

    public  void tetsingStaticKeyword(){
        System.out.println("I am staticKeyWord");
    }

    public void eatingFood(){
        food--;
        System.out.println("you have " +food);
    }

    static {
        System.out.println("I am the first Static block");
    }

    {
        System.out.println("I am the first Instance block");
    }




    public static void main(String[] args) {

        //1)Call method creating an object

//        StaticExamples staticExamples = new StaticExamples();
//        staticExamples.tetsingStaticKeyword();

        //2)I make the methods static then i can call with classname
       // tetsingStaticKeyword();




    }

}


