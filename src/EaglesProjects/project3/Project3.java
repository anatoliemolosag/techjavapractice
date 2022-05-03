package EaglesProjects;

import java.util.Scanner;

public class Project3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose the music type you want to listen below");
        System.out.println("Classical(2$) \nPop(4$) \nCountry(3$)");
        String musicTypes = sc.nextLine().toUpperCase();
        switch (musicTypes) { //1-Classical 2-Pop 3- Country
            case "CLASSICAL": {
                System.out.println("Which song would you like to listen to ? \n \n1- Ludwig van Beethoven -    Moonlight Sonata \n2- Claude Debussy -  Clair de lune \n3- Johann Sebastian - Bach \n4- Maurice Ravel - Bolero \n5- Franz Schubert - Ave Maria \nPlease enter the song name ");
                String classicalSongs = sc.nextLine().toUpperCase().trim();
                switch (classicalSongs) {
                    case "MOONLIGHT SONATA":
                        System.out.println("Please enter 2$ for this song");
                        double enteredPrice = sc.nextDouble();
                        String song1 = "Ludwig van Beethoven -     Moonlight Sonata";
                        songPlayer(enteredPrice,2 ,song1);
                        break;
                    case "CLAIR DE LUNE":
                        System.out.println("Please enter 2$ for this song");
                        enteredPrice = sc.nextDouble();
                        String song2 = "Claude Debussy -   Clair de lune";
                        songPlayer(enteredPrice,2 ,song2);
                        break;
                    case "BACH":
                        System.out.println("Please enter 2$ for this song");
                        enteredPrice = sc.nextDouble();
                        String song3 = "Johann Sebastian - Bach";
                        songPlayer(enteredPrice,2 , song3);
                        break;
                    case "BOLERO":
                        System.out.println("Please enter 2$ for this song");
                        enteredPrice = sc.nextDouble();
                        String song4 = "Maurice Ravel - Bolero";
                        songPlayer(enteredPrice,2 , song4);
                        break;
                    case "AVE MARIA":
                        System.out.println("Please enter 2$ for this song");
                        enteredPrice = sc.nextDouble();
                        String song5 = "Franz Schubert - Ave Maria";
                        songPlayer(enteredPrice,2 , song5);
                        break;
                    default:
                        System.out.println("The song is not available");
                }
                break;
            }
            case "POP": {
                System.out.println("Which song would you like to listen to ? \n \n1- Beyonce - Single Ladies \n2- Britney Spears - Toxic \n3- Adele - Rolling in the Deep \n4- Katy Perry - Firework \n5- Psy - Gangham Style \nPlease enter the song name ");
                String popSongs = sc.nextLine().toUpperCase().trim();
                switch (popSongs) {
                    case "SINGLE LADIES":
                        System.out.println("Please enter 4$ for this song");
                        double enteredPrice = sc.nextDouble();
                        String song1 = "Beyonce - Single Ladies";
                        songPlayer(enteredPrice,4 , song1);
                        break;
                    case "TOXIC":
                        System.out.println("Please enter 4$ for this song");
                        enteredPrice = sc.nextDouble();
                        String song2 = "Britney Spears - Toxic";
                        songPlayer(enteredPrice,4 , song2);
                        break;
                    case "ROLLING IN THE DEEP":
                        System.out.println("Please enter 4$ for this song");
                        enteredPrice = sc.nextDouble();
                        String song3 = "Adele - Rolling in the Deep";
                        songPlayer(enteredPrice,4 , song3);
                        break;
                    case "FIREWORK":
                        System.out.println("Please enter 4$ for this song");
                        enteredPrice = sc.nextDouble();
                        String song4 = "Katy Perry - Firework";
                        songPlayer(enteredPrice,4 , song4);
                        break;
                    case "GANGHAM STYLE":
                        System.out.println("Please enter 4$ for this song");
                        enteredPrice = sc.nextDouble();
                        String song5 = "Psy - Gangham Style";
                        songPlayer(enteredPrice,4 , song5);
                        break;
                    default:
                        System.out.println("This song is not available ");
                        break;
                }break;
            }
            case "COUNTRY": {
                System.out.println("Which song would you like to listen to ? \n \n1- Ray Charles - I Can't Stop Loving You  \n2- Elvis Presley - Don't Be Cruel \n3- Hank Williams - Your Cheating Heart \n4- Bill Monroe - Blue Moon Of Kentucky \n5- Garth Brooks - The Dance \nPlease enter the song name ");
                String countrySongs = sc.nextLine().toUpperCase().trim();
                switch (countrySongs) {
                    case "I CAN'T STOP LOVING YOU":
                        System.out.println("Please enter 3$ for this song");
                        double enteredPrice = sc.nextDouble();
                        String song1 = "Ray Charles - I Can't Stop Loving You";
                        songPlayer(enteredPrice,3 , song1);
                        break;
                    case "DON'T BE CRUEL":
                        System.out.println("Please enter 3$ for this song");
                        enteredPrice = sc.nextDouble();
                        String song2 = "Elvis Presley - Don't Be Cruel";
                        songPlayer(enteredPrice,3 , song2);
                        break;
                    case "YOUR CHEATING HEART":
                        System.out.println("Please enter 3$ for this song");
                        enteredPrice = sc.nextDouble();
                        String song3 = "Hank Williams - Your Cheating Heart";
                        songPlayer(enteredPrice,3 , song3);
                        break;
                    case "BLUE MOON OF KENTUCKY":
                        System.out.println("Please enter 3$ for this song");
                        enteredPrice = sc.nextDouble();
                        String song4 = "Bill Monroe - Blue Moon Of Kentucky";
                        songPlayer(enteredPrice,3 , song4);
                        break;
                    case "THE DANCE":
                        System.out.println("Please enter 3$ for this song");
                        enteredPrice = sc.nextDouble();
                        String song5 = "Garth Brooks - The Dance";
                        songPlayer(enteredPrice,3 , song5);
                        break;
                    default:
                        System.out.println("This song is not available ");
                        break;
                }break;
            }
            default:
                System.out.println(musicTypes+ " is not available");
                break ;
        }
    }
    public static void songPlayer (double enteredPrice, double requiredPrice ,String songName){
        if (enteredPrice == requiredPrice) {
            System.out.println(songName + " is playing . Enjoy the song !");
        } else if (enteredPrice > requiredPrice) {
            System.out.println("You have entered " + (enteredPrice - requiredPrice) + "$ more. Please wait for your change. \n" + songName + " is playing . Enjoy the song !");
        }else {
            System.out.println(enteredPrice + "$ is not enough.Please try again . ");
        }
    }

}





