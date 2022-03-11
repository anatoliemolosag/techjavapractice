package EaglesProjects.projects;

import java.util.Scanner;

public class LastProject {
    public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    int answer;
    int musicTypes;
    do {

        System.out.println("Please choose the music type you want listen below :\nEnter a number: \n1-Classical(2$) \n2-Pop(4$) \n3-Country(3$");

        musicTypes= input.nextInt();

        if (musicTypes <= 3 && musicTypes >= 1) {



            switch (musicTypes) {


                case 1:
                    System.out.println("Which song would you like to listen to ? " +
                            "\n \n1- Ludwig van Beethoven -    Moonlight Sonata " +
                            "\n2- Claude Debussy -  Clair de lune " +
                            "\n3- Johann Sebastian - Bach " +
                            "\n4- Maurice Ravel - Bolero " +
                            "\n5- Franz Schubert - Ave Maria " +
                            "\nPlease enter the song number ");

                    int songClassic = input.nextInt();


                    switch (songClassic) {
                        case 1:
                            System.out.println("Ludwig van Beethoven - Moonlight Sonata (Payment Require)");
                            System.out.println("Please enter $2 for listening the song");
                            double enterPrice1 = input.nextDouble();
                            double requirePrice1 = 2;
                            if (enterPrice1 == requirePrice1) {
                                System.out.println("Payment Received.\nLudwig van Beethoven - Moonlight Sonata is playing.\nEnjoy the Song");
                            } else if (enterPrice1 > requirePrice1) {
                                System.out.println("You entered " + (enterPrice1 - requirePrice1) + "$more.Please take your change!\nEnjoy the song! \nLudwig van Beethoven - Moonlight Sonata is playing");
                            } else {
                                System.out.println("Insufficient Amount.\nPlease try again and enter a different amount.");
                            }
                            break;
                        default: {
                            System.out.println("The entered number is not correct");
                        }
                        break;
                        case 2:
                            System.out.println("Claude Debussy -  Clair de lune");
                            System.out.println("Please enter $2 for listening the song");
                            double enterPrice2 = input.nextDouble();
                            double requirePrice2 = 2;
                            if (enterPrice2 == requirePrice2) {
                                System.out.println("Payment Received.\nClaude Debussy -  Clair de lune.\nEnjoy the Song");
                            } else if (enterPrice2 > requirePrice2) {
                                System.out.println("You entered " + (enterPrice2 - requirePrice2) + "$more.Please take your change!\nEnjoy the song! \nClaude Debussy -  Clair de lune");
                            } else {
                                System.out.println("Insufficient Amount.\nPlease try again and enter a different amount.");
                            }
                            break;
                        case 3:
                            System.out.println("Johann Sebastian - Bach");
                            System.out.println("Please enter $2 for listening the song");
                            double enterPrice3 = input.nextDouble();
                            double requirePrice3 = 2;
                            if (enterPrice3 == requirePrice3) {
                                System.out.println("Payment Received.\nClaude Debussy -  Clair de lune.\nEnjoy the Song");
                            } else if (enterPrice3 > requirePrice3) {
                                System.out.println("You entered " + (enterPrice3 - requirePrice3) + "$more.Please take your change!\nEnjoy the song! \nClaude Debussy -  Clair de lune");
                            } else {
                                System.out.println("Insufficient Amount.\nPlease try again and enter a different amount.");
                            }
                            break;
                        case 4:
                            System.out.println("Maurice Ravel - Bolero");
                            System.out.println("Please enter $2 for listening the song");
                            double enterPrice4 = input.nextDouble();
                            double requirePrice4 = 2;
                            if (enterPrice4 == requirePrice4) {
                                System.out.println("Payment Received.\nClaude Debussy -  Clair de lune.\nEnjoy the Song");
                            } else if (enterPrice4 > requirePrice4) {
                                System.out.println("You entered " + (enterPrice4 - requirePrice4) + "$more.Please take your change!\nEnjoy the song! \nClaude Debussy -  Clair de lune");
                            } else {
                                System.out.println("Insufficient Amount.\nPlease try again and enter a different amount.");
                            }
                            break;
                        case 5:
                            System.out.println("Franz Schubert - Ave Maria");
                            System.out.println("Please enter $2 for listening the song");
                            double enterPrice5 = input.nextDouble();
                            double requirePrice5 = 2;
                            if (enterPrice5 == requirePrice5) {
                                System.out.println("Payment Received.\nClaude Debussy -  Clair de lune.\nEnjoy the Song");
                            } else if (enterPrice5 > requirePrice5) {
                                System.out.println("You entered " + (enterPrice5 - requirePrice5) + "$more.Please take your change!\nEnjoy the song! \nClaude Debussy -  Clair de lune");
                            } else {
                                System.out.println("Insufficient Amount.\nPlease try again and enter a different amount.");
                            }
                            break;

                    }
                    break;


                case 2:
                    System.out.println("Which song would you like to listen to ? " +
                            "\n1- Beyonce - Single Ladies " +
                            "\n2- Britney Spears - Toxic " +
                            "\n3- Adele - Rolling in the Deep " +
                            "\n4- Katy Perry - Firework " +
                            "\n5- Psy - Gangham Style " +
                            "\nPlease enter the song name ");

                    int songPop = input.nextInt();
                    switch (songPop) {
                        case 1:
                            System.out.println("Beyonce - Single Ladies)");
                            System.out.println("Please enter $4 for listening the song");
                            double enterPrice1 = input.nextDouble();
                            double requirePrice1 = 4;
                            if (enterPrice1 == requirePrice1) {
                                System.out.println("Payment Received.\nBeyonce - Single Ladies\nEnjoy the Song");
                            } else if (enterPrice1 > requirePrice1) {
                                System.out.println("You entered " + (enterPrice1 - requirePrice1) + "$more.Please take your change!\nEnjoy the song! \nBeyonce - Single Ladies");
                            } else {
                                System.out.println("Insufficient Amount.\nPlease try again and enter a different amount.");
                            }
                            break;
                        default: {
                            System.out.println("The entered number is not correct");
                        }
                        break;
                        case 2:
                            System.out.println("Britney Spears - Toxic)");
                            System.out.println("Please enter $4 for listening the song");
                            double enterPrice2 = input.nextDouble();
                            double requirePrice2 = 4;
                            if (enterPrice2 == requirePrice2) {
                                System.out.println("Payment Received.\nBritney Spears - Toxic\nEnjoy the Song");
                            } else if (enterPrice2 > requirePrice2) {
                                System.out.println("You entered " + (enterPrice2 - requirePrice2) + "$more.Please take your change!\nEnjoy the song! \nBritney Spears - Toxic");
                            } else {
                                System.out.println("Insufficient Amount.\nPlease try again and enter a different amount.");
                            }
                            break;
                        case 3:
                            System.out.println("Adele - Rolling in the Deep)");
                            System.out.println("Please enter $4 for listening the song");
                            double enterPrice3 = input.nextDouble();
                            double requirePrice3 = 4;
                            if (enterPrice3 == requirePrice3) {
                                System.out.println("Payment Received.\nAdele - Rolling in the Deep\nEnjoy the Song");
                            } else if (enterPrice3 > requirePrice3) {
                                System.out.println("You entered " + (enterPrice3 - requirePrice3) + "$more.Please take your change!\nEnjoy the song! \nAdele - Rolling in the Deep");
                            } else {
                                System.out.println("Insufficient Amount.\nPlease try again and enter a different amount.");
                            }
                            break;
                        case 4:
                            System.out.println("Katy Perry - Firework)");
                            System.out.println("Please enter $4 for listening the song");
                            double enterPrice4 = input.nextDouble();
                            double requirePrice4 = 4;
                            if (enterPrice4 == requirePrice4) {
                                System.out.println("Payment Received.\nKaty Perry - Firework\nEnjoy the Song");
                            } else if (enterPrice4 > requirePrice4) {
                                System.out.println("You entered " + (enterPrice4 - requirePrice4) + "$more.Please take your change!\nEnjoy the song! \nKaty Perry - Firework");
                            } else {
                                System.out.println("Insufficient Amount.\nPlease try again and enter a different amount.");
                            }
                            break;
                        case 5:
                            System.out.println("Psy - Gangham Style)");
                            System.out.println("Please enter $4 for listening the song");
                            double enterPrice5 = input.nextDouble();
                            double requirePrice5 = 4;
                            if (enterPrice5 == requirePrice5) {
                                System.out.println("Payment Received.\nKaty Perry - Firework\nEnjoy the Song");
                            } else if (enterPrice5 > requirePrice5) {
                                System.out.println("You entered " + (enterPrice5 - requirePrice5) + "$more.Please take your change!\nEnjoy the song! \nKaty Perry - Firework");
                            } else {
                                System.out.println("Insufficient Amount.\nPlease try again and enter a different amount.");
                            }
                            break;


                    }
                    break;


                case 3:
                    System.out.println("Which song would you like to listen to ? " +
                            "\n1- Ray Charles - I Can't Stop Loving You  " +
                            "\n2- Elvis Presley - Don't Be Cruel " +
                            "\n3- Hank Williams - Your Cheating Heart " +
                            "\n4- Bill Monroe - Blue Moon Of Kentucky " +
                            "\n5- Garth Brooks - The Dance " +
                            "\nPlease enter the song name ");

                    int songCountry = input.nextInt();
                    switch (songCountry) {
                        case 1:
                            System.out.println("Ray Charles - I Can't Stop Loving You");
                            System.out.println("Please enter $3 for listening the song");
                            double enterPrice1 = input.nextDouble();
                            double requirePrice1 = 3;
                            if (enterPrice1 == requirePrice1) {
                                System.out.println("Payment Received.\nRay Charles - I Can't Stop Loving You\nEnjoy the Song");
                            } else if (enterPrice1 > requirePrice1) {
                                System.out.println("You entered " + (enterPrice1 - requirePrice1) + "$more.Please take your change!\nEnjoy the song! \nRay Charles - I Can't Stop Loving You");
                            } else {
                                System.out.println("Insufficient Amount.\nPlease try again and enter a different amount.");
                            }
                            break;
                        default: {
                            System.out.println("The entered number is not correct");
                        }
                        break;
                        case 2:
                            System.out.println("Elvis Presley - Don't Be Cruel");
                            System.out.println("Please enter $3 for listening the song");
                            double enterPrice2 = input.nextDouble();
                            double requirePrice2 = 3;
                            if (enterPrice2 == requirePrice2) {
                                System.out.println("Payment Received.\nElvis Presley - Don't Be Cruel\nEnjoy the Song");
                            } else if (enterPrice2 > requirePrice2) {
                                System.out.println("You entered " + (enterPrice2 - requirePrice2) + "$more.Please take your change!\nEnjoy the song! \nElvis Presley - Don't Be Cruel");
                            } else {
                                System.out.println("Insufficient Amount.\nPlease try again and enter a different amount.");
                            }
                            break;
                        case 3:
                            System.out.println("Hank Williams - Your Cheating Heart");
                            System.out.println("Please enter $3 for listening the song");
                            double enterPrice3 = input.nextDouble();
                            double requirePrice3 = 3;
                            if (enterPrice3 == requirePrice3) {
                                System.out.println("Payment Received.\nHank Williams - Your Cheating Heart\nEnjoy the Song");
                            } else if (enterPrice3 > requirePrice3) {
                                System.out.println("You entered " + (enterPrice3 - requirePrice3) + "$more.Please take your change!\nEnjoy the song! \nHank Williams - Your Cheating Heart");
                            } else {
                                System.out.println("Insufficient Amount.\nPlease try again and enter a different amount.");
                            }
                            break;
                        case 4:
                            System.out.println("Bill Monroe - Blue Moon Of Kentucky");
                            System.out.println("Please enter $3 for listening the song");
                            double enterPrice4 = input.nextDouble();
                            double requirePrice4 = 3;
                            if (enterPrice4 == requirePrice4) {
                                System.out.println("Payment Received.\nBill Monroe - Blue Moon Of Kentucky\nEnjoy the Song");
                            } else if (enterPrice4 > requirePrice4) {
                                System.out.println("You entered " + (enterPrice4 - requirePrice4) + "$more.Please take your change!\nEnjoy the song! \nBill Monroe - Blue Moon Of Kentucky");
                            } else {
                                System.out.println("Insufficient Amount.\nPlease try again and enter a different amount.");
                            }
                            break;
                        case 5:
                            System.out.println("Garth Brooks - The Dance");
                            System.out.println("Please enter $3 for listening the song");
                            double enterPrice5 = input.nextDouble();
                            double requirePrice5 = 3;
                            if (enterPrice5 == requirePrice5) {
                                System.out.println("Payment Received.\nGarth Brooks - The Dance\nEnjoy the Song");
                            } else if (enterPrice5 > requirePrice5) {
                                System.out.println("You entered " + (enterPrice5 - requirePrice5) + "$more.Please take your change!\nEnjoy the song! \nGarth Brooks - The Dance");
                            } else {
                                System.out.println("Insufficient Amount.\nPlease try again and enter a different amount.");
                            }
                            break;


                    }


            }}else {
            System.out.println("Invalid");

        }


        System.out.println("Would you like to try again?\n1 YES \n2 NO");
        answer = input.nextInt();






    }while (answer==1) ;
    System.out.println("It's ok , see you next time");

}

}

