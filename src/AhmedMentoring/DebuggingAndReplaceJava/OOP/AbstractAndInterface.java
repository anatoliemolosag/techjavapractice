package AhmedMentoring.DebuggingAndReplaceJava.OOP;

public class AbstractAndInterface {

    /*
    Interview Questions

    1)What is Abstract? and can you clarify it with details?
    *I use abstract keyword to make the class or methods abstract.
    *abstract is a way to organize the methods with only necessary information
    (we do not need to have a body for abstract methods because every class which extends to the abstract class can make their own implementation by overriding

    2)Why do you need to have abstract class in your project?
    *For many methods , we need developers to make their own implementation in the company.
    so they can create abstract class with the template of the specific methods and let people call it based on their requirements
    (like override and do implementation)

    3)Where do you use abstract in your project ?
    I would definitely say i that i use general OOp concept in everywhere in my project.

    4)Can you create an object in abstract class?IIf no, how you can access all
    of the methods from that class?
    *You can not create an object in abstract class , so you need to OVERRIDE
    methods(without body) to access methods.
    *To be able  to create a methode without body , you need to put abstract
    keyword after access modifiers for method.

    5)Can you have normal and abstract methods inside of the class?
    Yes you can have both.


    INTERFACE INTERVIEW QUESTIONS
    *We use Implements keyword to make the class connected with interface.
    1)What is interface ?
    Interface is blueprint of the object of class which has special methods that can be overridden to make new implementation

    2)Why do you need interface if you have abstract?
    *Because have more futures in terms of accessing the more parents by overriding their methods.

    3)What is the difference between abstract and interface?(most common question)

    INTERFACE:
    1-Interface class is declared with Intefface Keyword
    2-Interface class can have only abstract methods (default keyword is exception)
    3-To make a connection with interface class we need to use IMPLEMENTS keyword.
    ***4-In interface you can implement the class as many times you want (multiparents) and extends keyword(once)
    5-When you declare a variable in interface as default it is final static .
    6-Methods must be public abstract
    7-Interface can not have constructor

    ABSTRACT:
    1-Abstract class is declare with abstract keyword
    2-Abstract class can have concrete and abstract methods.
    3-to make connection with class we use EXTENDS keyword.
    ***4-In abstract you can extend the class once.
    5-When you declare a variable in abstract as default any variable.(You can have any variables)
    6-methods can be public protected private...for methods.
    7-Abstract can have constructor
     */

}
