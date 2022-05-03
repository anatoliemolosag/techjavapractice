package Arrays;

import java.util.Arrays;
import java.util.Locale;

public class SplitPractice1 {
    public static void main(String[] args) {
        String text = "Eagles are large, powerfully built birds of prey, with heavy heads and beaks." +
                " Even the smallest eagles, such as the booted eagle (Aquila pennata)," +
                " which is comparable in size to a common buzzard (Buteo buteo) or red-tailed hawk (B. jamaicensis)," +
                " have relatively longer and more evenly broad wings, and more direct, faster flight – " +
                "despite the reduced size of aerodynamic feathers. Most eagles are larger than any other " +
                "raptors apart from some vultures.The smallest species of eagle is the South Nicobar serpent " +
                "eagle (Spilornis klossi), at 450 g (1 lb) and 40 cm (16 in). The largest species are discussed " +
                "below. Like all birds of prey, eagles have very large hooked beaks for ripping flesh from their prey," +
                " strong, muscular legs, and powerful talons. The beak is typically heavier than that of most " +
                "other birds of prey. Eagles' eyes are extremely powerful. It is estimated that the martial eagle, " +
                "whose eyes are more than two times larger than the human eye, has a visual acuity up to 8 times that of humans." +
                " This acuity enables eagles to spot potential prey from a very long distance.[2]  " +
                "This keen eyesight is primarily attributed to their extremely large pupils which ensure minimal " +
                "diffraction (scattering) of  incoming   " +
                ".";
        //Find and print the words that has odd amount of letters --> large
        String newtext = "";
        int i;
        for(i=0; i<text.length();i++){
            if(Character.isAlphabetic(text.charAt(i)) || text.charAt(i-1)!=' '){
                newtext+=text.charAt(i);
            }
        }
        System.out.println(newtext);
        String[] array = newtext.split(" ");
        int count =0;
        for (String word : array){
            if(word.length()%2 != 0){
                System.out.println(word);
                count++;

            }
        }
        System.out.println(count);


    }

}
