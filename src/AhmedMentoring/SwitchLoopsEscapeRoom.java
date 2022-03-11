package AhmedMentoring;

public class SwitchLoopsEscapeRoom {
    public static void main(String[] args) {

            int variable =7;
            switch (variable++)
            {
                case 7:
                    switch (variable--) {
                        default:
                            System.out.print(variable);
                        case 7:
                    }
                        default:
                    System.out.print ("wonders");

}}}
