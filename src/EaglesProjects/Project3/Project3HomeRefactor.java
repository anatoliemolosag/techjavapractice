package EaglesProjects.Project3;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class TESTING {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Please choose the music type you want listen below : \n1-Classical(2$) \n1-Pop(4$) \n3-Country(3$");


        int musicTypes = input.nextInt();

        switch (musicTypes){
            case 1 :
                System.out.println("Which song would you like to listen to ? " +
                        "\n \n1- Ludwig van Beethoven -    Moonlight Sonata " +
                        "\n2- Claude Debussy -  Clair de lune " +
                        "\n3- Johann Sebastian - Bach " +
                        "\n4- Maurice Ravel - Bolero " +
                        "\n5- Franz Schubert - Ave Maria " +
                        "\nPlease enter the song number ");
                int song = input.nextInt();
                switch (song){
                    case 1:
                        System.out.println("Ludwig van Beethoven - Moonlight Sonata (Payment Require)");
                        System.out.println("Please enter $2 for listening the song");
                        double enterPrice = input.nextDouble();
                        double requirePrice =2;
                        if (enterPrice==requirePrice){
                            System.out.println("Payment Received.\nLudwig van Beethoven - Moonlight Sonata is playing.\nEnjoy the Song");
                        }else if(enterPrice>requirePrice){
                            System.out.println("You entered " + (enterPrice-requirePrice) + "$more.Please take your change!\nEnjoy the song! \nLudwig van Beethoven - Moonlight Sonata is playing");
                        }else{
                            System.out.println(enterPrice + "$ is not enough.Please try again . ");
                        }
                        break;
                    case 2:
                        System.out.println("Claude Debussy -  Clair de lune");break;
                    case 3:
                        System.out.println("Johann Sebastian - Bach");break;
                    case 4:
                        System.out.println("Maurice Ravel - Bolero");break;
                    case 5:
                        System.out.println("Franz Schubert - Ave Maria");break;

                }break;



            case 2:
                System.out.println("2-POP MUSIC");




            case 3 :
                System.out.println("3-COUNTRY MUSIC");

                }
        }

    }

