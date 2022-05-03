package AhmedMentoring.DebuggingAndReplaceJava.OOP;

public class Polymorphisim {

    /*
    Interview Questions

    1-What is Polymorphism ?(poly means many )(morphism --> form)
    *It is a different forms of object, methods.

    2-What is dynamic and static polymorphism?
    *Dynamic polimorphism : RunTime --> it happens in overriding -->Dynamic(action)
    *Static polymophism : Compile time --> Overloading

    3-What is overloading and overriding? and what is difference between them?

    Overloading -Overriding

    *)Overloading must have different method SIgnature(reference +parameters)
      -->public void overloding (int a)
      -->public void overloding (int a, String b)
    *)Overloading methods must should be in the same class.
    *Overloading methods can have have final , static , private (it means return type and access modifiers can be different or more accesible)


    Oerriding
    *must have same exactly same signature and access modifiers and return type.
    *Overriding can have more accessible types of access modifiers and co-variant the return type
    ***Overriding can not be private, static , final
    **to be able to override the methods you should have parent-child relationship .(abstract, interface ..)

     */
}
